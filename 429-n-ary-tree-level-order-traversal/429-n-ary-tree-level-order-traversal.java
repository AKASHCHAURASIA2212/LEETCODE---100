/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
public  List<List<Integer>> GTLO(Node node){

    List<List<Integer>> list = new ArrayList<>();
    if(node==null)
        return list;
    Queue<Node> qu = new LinkedList<>();
    qu.add(node);

    
    while(qu.size()>0)
    {
        int size = qu.size();
         List<Integer> li = new ArrayList<>();
        while(size-->0)
         {
         
          Node peek = qu.remove();
          // System.out.print(peek.val+" ");
          li.add(peek.val);
        
          for(Node c : peek.children)
          {
            qu.add(c);
          }
        
         }
    
         list.add(li);
    }
    
    return list;
  }
    
   
    public List<List<Integer>> levelOrder(Node root) {
        
        return GTLO(root);
    }
}