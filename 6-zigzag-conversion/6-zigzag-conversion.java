class Solution {
    
    public String addSpace(String str , int nos)
    {
        String ans = "";
        for(int i=0;i<nos;i++)
        {
            ans+='#';
        }
        ans+=str;
        
        return ans ; 
    }
    public String convert(String s, int numRows) {
        ArrayList<String> li = new ArrayList<>();
        
        while(s.length()>0)
        {
            if(s.length()<numRows)
            {
                li.add(s);
                System.out.println(s);
                s = "";
                continue;
            }
            String str = s.substring(0,numRows);
            s = s.substring(numRows);
            li.add(str);
            System.out.println(str);
            
            for(int i=0;i<numRows-2;i++)
            {
                if(s.length()>0)
                {
                str = s.charAt(0)+"";
                String spc = addSpace(str,numRows-2-i);
                s = s.substring(1);
                System.out.println(spc);
                li.add(spc);
                }
                else
                {
                    i = numRows ; 
                }
            }
        }
        String ans = "" ; 
        for(int i=0;i<numRows;i++)
        {
            for(String str : li)
            {
                if(str.length()<=i)
                {
                  continue;
                }
                char ch = str.charAt(i);
                if(ch=='#')
                {
                   // do nothing 
                }
                else
                {
                  ans+=ch ;
                }
            }
        }
        
        return ans ; 
    } 
}