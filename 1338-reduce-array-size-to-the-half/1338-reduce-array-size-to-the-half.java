class Solution {
    
    public void Display(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+ " ");
       }
    }
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();    
        for(int i=0;i<arr.length;i++) {
            int val = arr[i];   
            if(hm.containsKey(val))  {
                hm.put(val, hm.get(val) + 1);   
            } else
            {
                hm.put(val,1);
            }
        }
          System.out.println(hm.keySet());
     
        int size[] = new int[hm.size()];
       int  j=0;
        for(int key : hm.keySet())
        {
            size[j]=hm.get(key);
            j++;
        }
 
        Arrays.sort(size);
        int occr=0,count=0;
        for(int i=size.length-1;i>=0;i--)
        {
            occr+=size[i];
            count++;
            if(occr>=arr.length/2)
            {
                break ;
            }
        }
        
        return count ;
    }
}