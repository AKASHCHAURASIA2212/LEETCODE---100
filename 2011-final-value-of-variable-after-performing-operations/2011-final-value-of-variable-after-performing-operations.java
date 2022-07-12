class Solution {
    
    public int opretion(int num,String str)
    {
       if(str.equals("--X") || str.equals("X--"))
       {
           return num-1;
       }
        else
        {
           return num+1;
        }
    }
    public int finalValueAfterOperations(String[] operations) {
        
        int x = 0 ; 
        for(int i=0;i<operations.length;i++)
        {
           String str = operations[i];
               int ans = opretion(x,str);
               x = ans;
        }
        return x;
    }
}