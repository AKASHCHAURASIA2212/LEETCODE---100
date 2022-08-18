class Solution {
    
     public void Display(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+ " ");
       }
        System.out.println();
    }
    
       public void Display(List<Integer> arr)
    {
       for(int i=0;i<arr.size();i++)
       {
           System.out.print(arr.get(i)+ " ");
       }
           System.out.println();
    }
    public int minSetSize(int[] arr) {
        
        int half = arr.length / 2;
        int result = 0;
        int fi = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: arr){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        List<Integer> frequency = new ArrayList<>();
        for(Integer i : hm.keySet()){
            frequency.add(hm.get(i));
        }
        // System.out.println(frequency);
        Display(frequency);
        Collections.sort(frequency, Collections.reverseOrder());
        Display(frequency);
        for(int i: frequency){
            fi++;
            result += i;
            if(result >= half) break;
        }
        
        
        return fi;
    }
}