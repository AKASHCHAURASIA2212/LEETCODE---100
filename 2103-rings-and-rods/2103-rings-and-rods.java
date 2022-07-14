class Solution {
    
    public boolean isUnique(String str,Character ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                return false;
            }
        }
        return true;
    }
    public int countPoints(String rings) {
        
        HashMap<Integer,String> hm = new HashMap<>();
        
     
        for(int i=0;i<rings.length();i++)
        {
            char color = rings.charAt(i);
            char ch = rings.charAt(i+1);
            int num=(int)ch-'0';
            
            System.out.println("color-->"+color);
            System.out.println("char-->"+ch);
            System.out.println("num-->"+num);

            if(!hm.containsKey(num))
            {
                hm.put(num,color+"");
            }
            else
            {
               String str = hm.get(num);
                
                if(isUnique(str,color))
                {
                    str+=color;
                    hm.put(num,str);
                }
            }
            i=i+1;
        }
        
        int count = 0 ;
        
        for(int i=0;i<10;i++)
        {
            if(hm.get(i)!=null)
            {
                           if(hm.get(i).equals("GRB")|| hm.get(i).equals("RGB") || hm.get(i).equals("GBR") || hm.get(i).equals("BGR") || hm.get(i).equals("RBG") || hm.get(i).equals("BRG"))
            {
                count++;
            }
            }

            System.out.println(hm.get(i));
        }
        return count ;
        
    }
}