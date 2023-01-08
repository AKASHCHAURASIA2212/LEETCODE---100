class Solution {
    
    public int findGcd(int a,int b){
        if(b==0){
            return a;
        }
        
        return findGcd(b,a%b);
    }
    public int maxPoints(int[][] points) {
        
        int n = points.length;
        
        if(n==1)return 1;
        int result = 0;
        
        for(int i=0;i<n;i++){
            // P1 (x1,y1)
            HashMap<String,Integer> hm = new HashMap<>();
            for(int j=0;j<n;j++){
                
                if(i==j)continue;
                // P2 (x2,y2)
                int dx = points[j][0]-points[i][0]; // x2-x1
                int dy = points[j][1]-points[i][1]; // y2-y1
                int gcd = findGcd(dx,dy);
                dx/=gcd;
                dy/=gcd;
                
                
                String slope = ""+dx+"_"+dy;
                
                if(hm.containsKey(slope)==false){
                    hm.put(slope,1);
                }else{
                    hm.put(slope,hm.get(slope)+1);
                }
            }
            
            // System.out.println(hm);
            for(String key : hm.keySet()){
                result = Math.max(result,hm.get(key));
            }
        }
        return result+1;
    }
}