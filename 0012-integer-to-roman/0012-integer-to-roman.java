class Solution {
    public String intToRoman(int num) {
        int[] numcode = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romcode = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        
        int temp = num ;
        String ans = "" ;
        for(int i=numcode.length-1;i>=0 && num!=0;i--){
            
            int div = num/numcode[i];
            // System.out.println(div);
            if(div!=0){
              for(int j=1;j<=div;j++){
                  ans+=romcode[i];
              }
            }
            num=num%numcode[i];
        }
        return ans ;
    }
}