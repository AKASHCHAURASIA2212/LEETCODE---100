class Solution{
    public int[] findOriginalArray(int[] changed) {
    int[] temp = new int[changed.length/2];
    Queue<Integer> x = new LinkedList<>();
    Arrays.sort(changed);
    int i = 0;
    for(int num : changed){
        if(!x.isEmpty() && x.peek()==num)
            temp[i++] = x.poll()/2;
        else x.add(num*2);
    }
    return x.size()>0 ? new int[]{}:temp;
}
}
// class Solution {
//     public int[] findOriginalArray(int[] changed) {
//         Arrays.sort(changed);
//         int n = changed.length;
//         // check 1
//         if(n%2==1 || changed[0]==0 && changed[1]!=0 || changed.length==1)return new int[0];
        
//         //check 2
//         boolean[] vis = new boolean[n];
//         HashMap<Integer,Integer> set  = new HashMap<>();
//         for(int i=0;i<n;i++){
//             set.put(changed[i],i);
//         }
        
//         if(set.size()==1 && changed[0]==0){
//              int ans[] = new int[n/2];
//             int k=n/2;
//             for(int i=0;i<k;i++){
//                 ans[i]=changed[i];
//             }
//             return ans ;
//         }
        
//         System.out.println(set);
        
//         ArrayList<Integer> al = new ArrayList<>();
        
//         for(int i=0;i<n;i++){
//            if(vis[i]==false){
//                 int key = changed[i]*2;
//              Integer idx = set.get(key);
//             if(idx==null) continue;
//             if(set.containsKey(key))
//             {
               
//                 vis[idx]=true;
//                   al.add(changed[i]);  
//                 // set.remove(changed[i]*2);
//             }
//            }
//         }
        
//         for(int x:al){
//             System.out.print(x+" ");
//         }
//         if(al.size()==n/2){
//             int ans[] = new int[n/2];
//             int k=0;
//             for(int x : al){
//                 ans[k]=x;
//                 k++;
//             }
//             return ans ;
//         }
//         return new int[0];
      
//     }
// }