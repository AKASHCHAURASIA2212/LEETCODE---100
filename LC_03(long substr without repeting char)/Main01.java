public class Main01 {
    
        public static boolean distinctStr(String str)
        {
            String temp = "";
            for(int i=0;i<str.length();i++)
            {
                char ch  = str.charAt(i);
                temp+=ch;
                if(str.substring(i+1).contains(ch+""))
                {
                  return false;
                }
            }
            return true;
        }
        public int lengthOfLongestSubstring(String s) {
            String max = "";
            String temp= "";
            int count = 0;
            for(int i=0;i<s.length();i++)
            {
                for(int j=i+1;j<=s.length();j++)
                {
                    String substr = s.substring(i,j);
                    count++;
                    // System.out.println("substring--->"+substr);
    
                    if(distinctStr(substr))
                    {
                        if(substr.length()>max.length())
                        {
                            max="";
                            max+=substr;
                            // System.out.println("max--->"+max);
                            substr="";
                        }
                    }
                }
            }
            System.out.println("count"+count);
            return max.length();
            
            
    //         for(int i=0;i<s.length();i++)
    //         {
    //             char ch = s.charAt(i);
                
    //             if(!max.contains(ch+""))
    //             {
    //                 max+=ch;
    //                 System.out.println("max--->"+max);
    //             }
    //             else
    //             {
    //                 if(max.length()>temp.length())
    //                 {
    //                     temp="";
    //                     temp+=max;
    //                 }
    //                 max = ""+ch;
    //             }
    //         }
            
    //           if(max.length()>temp.length())
    //                 {
    //                     temp="";
    //                     temp+=max;
    //                 }
            
    //         return temp.length();
        }
    }
}
