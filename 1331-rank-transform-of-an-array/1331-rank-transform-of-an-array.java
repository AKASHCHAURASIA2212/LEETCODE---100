class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr2 = new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i];
        }
        
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
             hm.put(arr[i],count);
             count++;
            }
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            Integer rank = hm.get(arr2[i]);
            arr2[i]=rank;
        }
        
        return arr2;
    }
}