class Solution {
    
       public static List<Integer> createList(List<Integer> li)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        
        for(int i = 1 ; i < li.size();i++)
        {
            list.add(li.get(i-1)+li.get(i));
        }
        list.add(1);
        return list;
    }
    
    public static List<Integer> pascalTriangle(int num)
    {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(1);
        list.add(li);
        for(int i = 1 ; i<num; i++)
        {

            li = createList(li);
            list.add(li);
        }
        // System.out.println(list);
        return list.get(num-1);
        
    }
    public List<Integer> getRow(int rowIndex) {
         return pascalTriangle(rowIndex+1);
    }
}