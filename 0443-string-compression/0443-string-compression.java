// class Solution {
//     public int compress(char[] chars) {
//         int count=1;
//         String myAns = "";
//         for(int i=0;i<chars.length;i++){
//             char x = chars[i];
            
//             if(i==chars.length-1){
//                 if(count==1){
//                     myAns+=x;
//                 }else{
//                     myAns+=x+""+count;
//                 }
//                 // System.out.println(myAns);
//             }
//             else if(x==chars[i+1]){
//                 count++;
//             }else{
//                 if(count==1){
//                     myAns+=x;
//                 }else{
//                     myAns+=x+""+count;
//                 }
//                 // System.out.println(myAns);
//                 count=1;
//             }
//         }
//         System.out.println(myAns);
//          int n = myAns.length();
//         char[] ans = new char[n];
        
//         for(int i=0;i<n;i++){
//             ans[i]=myAns.charAt(i);
//         }
//         return ans.length;
//     }
// }
class Solution {
public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray()) 
                    chars[indexAns++] = c;
        }
        return indexAns;
    }
    
}