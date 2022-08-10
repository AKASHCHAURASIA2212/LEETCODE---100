class Solution {
    String[] code = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        if(digits.length()==0)
        {
            
            return new ArrayList<String>() ;
        }
        
        char currdigit = digits.charAt(0);
        digits = digits.substring(1);
        
        String mycode = code[currdigit-'1'];
        
        System.out.println(mycode);
        List<String> recAns = letterCombinations(digits);
        
        List<String> myAns = new ArrayList<>();
        
        for(int i=0;i<mycode.length();i++)
        {
            char ch = mycode.charAt(i);
            if(recAns.size()!=0)
            {
              for(String str : recAns)
            {
                myAns.add(ch+str);
            }
            }
            else
            {
                   myAns.add(ch+""); 
            }
            
        
        }
        
        return myAns ;
    }
}