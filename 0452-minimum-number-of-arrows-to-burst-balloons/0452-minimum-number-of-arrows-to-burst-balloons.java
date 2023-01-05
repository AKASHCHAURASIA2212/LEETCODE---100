class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if(points.length==0)return 0;
        
        Arrays.sort(points,(point1,point2)-> Integer.compare(point1[1],point2[1]));
        
        int count=1;
        
        int endpoint = points[0][1];
        
        for(int i=1;i<points.length;i++){
            if(endpoint>=points[i][0]){
                continue;
            }
            
            count++;
            endpoint = points[i][1];
        }
        
        return count;
        
    }
}