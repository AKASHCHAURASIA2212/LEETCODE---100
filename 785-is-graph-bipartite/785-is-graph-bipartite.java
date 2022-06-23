class Solution {
    
    public class Pair{
          int vtx;
          int clr;
        public Pair(int vtx,int clr){
            this.vtx=vtx;
            this.clr=clr;
        }
    }
    
    public boolean isBip(int graph[][],int v , int[] vis)
    {
        Queue<Pair> qu = new LinkedList<>();
        //  0 unvisted
        //  1 red
        // -1 blue
        qu.add(new Pair(v,1));
        
        while(qu.size()>0)
        {
            // r m* w a*
            
            Pair rem = qu.remove();
            
            System.out.println("v-->"+rem.vtx+" clr-->"+rem.clr);
            if(vis[rem.vtx]!=0)
            {
                //some work
                int oldclr = vis[rem.vtx];
                int newclr = rem.clr;
                
                if(oldclr!=newclr)
                {
                    return false;
                }
            }
            
            vis[rem.vtx]=rem.clr;
            
            // System.out.println("addnbr - v "+v);
            for(int e : graph[rem.vtx])
            {
                if(vis[e]==0)
                {
                    // System.out.println("addnbr - v-->"+v+" nbr--> "+ e);
                    qu.add(new Pair(e,rem.clr * -1));
                }
            }
        }
        
        return true;
    } 
    public boolean isBipartite(int[][] graph) {
        
              
        int n = graph.length;
    
        int[] vis = new int[n];
        
        Queue<Pair> qu = new LinkedList<>();
        
        for(int v=0;v<n;v++)
        {
            if(vis[v]==0)
            {
               boolean isbip = isBip(graph,v,vis);
                
                if(!isbip)
                {
                   return false;
                }
            }
           
        }
        
        return true;
    }
}