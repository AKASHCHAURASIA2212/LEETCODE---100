// class Solution {
    
//     ArrayList<Integer> ans = new ArrayList<>();
    
//     public boolean check(String str,int k){
//         for(int i=0;i<str.length()-1;i++){
//             int diff = (int)str.charAt(i) - (int)str.charAt(i+1) ;
//             diff = Math.abs(diff);
//             if(diff!=k){
//                 return false ;
//             }
//         }
//         return true ;
//     }
    
//     public ArrayList<Integer> helper1(String str ,int[] code,int n ,int k){
//         int num = Integer.parseInt(str)  ;
//         if(num==0 || str.charAt(0)=='0'){
//                 // some work ;
//             return ans ; 
//          }
//         boolean flag = check(str,k);
//         if(flag){
//             ans.add(num);
//         }
        
//         String newstr = "" ;
//         for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i); 
//             if(ch=='0' && flag==true){
//               newstr+='1';
//             }
//             else{      
//                   newstr+=code[ch-'0'] ;
//             } 
//         }
//         return  helper1(newstr,code,n ,k) ;
//     }
    
    
//     public ArrayList<Integer> helper2(String str ,int[] code,int n ,int k){
//         int num = Integer.parseInt(str)  ;
//         if(num==0 || str.charAt(0)=='0'){
//                 // some work ;
//             return ans ; 
//          }
//         boolean flag = check(str,k);
//         if(flag){
//             ans.add(num);
//         }
        
//         String newstr = "" ;
//         for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i); 
//             if(ch=='0' && flag==true){
//               newstr='1'+newstr;
//             }
//             else{      
//                   newstr=code[ch-'0']+newstr ;
//             } 
//         }
//         return  helper2(newstr,code,n ,k) ;
//     }
//     public int[] numsSameConsecDiff(int n, int k) {
//         int[] code = {0,2,3,4,5,6,7,8,9,0};
//         String str2 = "1"+code[k];
//         String str22 = code[k]+"1";
        
//         int mq = n/2;
//         int mr = n%2;
        
//         for(int i=1;i<mq;i++){
//             str2+=str2;
//         }
//         if(mr!=0){
//             str2+="1";
//         }
        
//          ArrayList<Integer> ans1 = helper1(str2 ,code,n,k);
//          ArrayList<Integer> ans2 = helper2(str22,code,n,k);
        
//         int newans[] = new int[ans1.size()+ans2.size()];
//         int i=0;
//         for(int x : ans1){
//             newans[i]=x;
//             i++;
//         }
        
//         for(int x : ans2){
//             newans[i]=x;
//             i++;
//         }
        
//         return newans ;
     
//     } 
// }


class Solution {

    public int[] numsSameConsecDiff(int N, int K) {

        if (N == 1)
            return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> queue = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for(int level = 1; level < N; ++ level) {
            ArrayList<Integer> nextQueue = new ArrayList<>();
            // iterate through each number within the level
            for (Integer num : queue) {
                Integer tailDigit = num % 10;

                ArrayList<Integer> nextDigits = new ArrayList<>();
                nextDigits.add(tailDigit + K);
                if (K != 0)
                    nextDigits.add(tailDigit - K);
                for (Integer nextDigit : nextDigits) {
                    if (0 <= nextDigit && nextDigit < 10) {
                        Integer newNum = num * 10 + nextDigit;
                        nextQueue.add(newNum);
                    }
                }
            }
            // prepare for the next level
            queue = nextQueue;
        }

        return queue.stream().mapToInt(i->i).toArray();
    }
}