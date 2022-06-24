class Solution {

    public class Pair{

        int bus;
        int csf;
        
        public Pair(int bus,int csf)
        {
            this.bus=bus;
            this.csf=csf;
        }
    }
    
    public int numBusesToDestination(int[][] routes, int source, int target) {
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        
        if(source==target)
        {
            return 0;
        }
        for(int bus=0;bus<routes.length;bus++)
        {
             for(int stop : routes[bus])
             {
                 if(!hm.containsKey(stop))
                 {
                     hm.put(stop,new ArrayList<>());
                 }
                 
                  hm.get(stop).add(bus);
                  
             }
        }
        
      Queue<Pair> qu = new LinkedList<>();
        for(int srcb : hm.get(source)){
           qu.add(new Pair(srcb,1));
        }
        
        boolean[] vis = new boolean[routes.length];
        
        while(qu.size()>0)
        {
            Pair rem = qu.remove();
            if(vis[rem.bus])
            {
                continue;
            }
            vis[rem.bus]=true;
            
            for(int rstop : routes[rem.bus]){
               if(rstop==target)
               {
                 return rem.csf;
               }
            }
            
            for(int rstop : routes[rem.bus]){
               for(int bus : hm.get(rstop)) {
                  if(vis[bus]==false){
                     qu.add(new Pair(bus,rem.csf+1));
                  }
               }
            }
        }
           
        return -1;
    }
}