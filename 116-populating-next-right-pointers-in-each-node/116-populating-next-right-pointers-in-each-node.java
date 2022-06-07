/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root==null)
        {
            return null;
        }
        
        Queue<Node> qu = new LinkedList<>();
        Queue<Node> qu2 = new LinkedList<>();
        
        qu.add(root);
        
        // System.out.print(qu);
        while(qu.size()>0)
        {    
            qu.add(null);
            int size = qu.size();
            while(size-->0)
            {
              Node temp = qu.remove();
                qu2.add(temp);
        
                
                if(temp==null)
                {
                    continue;
                }
                
                if(temp.left!=null)
                {
                    qu.add(temp.left);
                }
                
                if(temp.right!=null)
                {
                    qu.add(temp.right);
                }
            
            }
        }
        
        while(qu2.size()>1)
        {
            Node temp = qu2.remove();
            Node peek = qu2.peek();
            if(temp!=null)
            {
                temp.next=peek;
            }
        }
        
    
        
        // System.out.println(qu2);
        
        return root;
        
    }
}