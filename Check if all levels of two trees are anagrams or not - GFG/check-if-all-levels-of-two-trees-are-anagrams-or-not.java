//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    
    public static Node buildTree(String str)
    {
        // Corner Case
        if(str.length()==0 || str.charAt(0)=='N')
            return null;
        
        // Creating array of Strings from input 
        // String after spliting by space
        String ip[] = str.split(" ");
        
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        
        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        
        // Starting from the second element
        int i = 1;
        while(queue.size()>0 && i < ip.length)
        {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static Node inputTree(BufferedReader br) throws IOException
    {
        return buildTree(br.readLine().trim());
    }
    
    public static void inorder(Node root)
    {
        if (root == null)
           return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node node1 = Node.inputTree(br);
            
            
            Node node2 = Node.inputTree(br);
            
            Solution obj = new Solution();
            boolean res = obj.areAnagrams(node1, node2);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    public static ArrayList<ArrayList<Integer>> Helper(Node root){
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        
        Queue<Node> qu = new LinkedList<>();
        
        qu.add(root);
        // qu.add(null);
        
        while(qu.size()>0){
            ArrayList<Integer> al = new ArrayList<>();
            int size = qu.size();
            
            while(size-->0){
                Node rem  = qu.remove();
                    al.add(rem.data);
                    
                    if(rem.left!=null){
                        qu.add(rem.left);
                    }
                    if(rem.right!=null){
                        qu.add(rem.right);
                    }
            }
            List.add(al);
        }
        return List;
    }
    public static boolean areAnagrams(Node node1, Node node2) {
        // code here
        ArrayList<ArrayList<Integer>> al1= Helper(node1);
        ArrayList<ArrayList<Integer>> al2= Helper(node2);
        // System.out.println(al1+"\n"+al2);
        if(al1.size()!=al2.size()){
            return false;
        }
        
        for(int i=0;i<al1.size();i++){
            
            ArrayList<Integer> l1 = al1.get(i);
            ArrayList<Integer> l2 = al2.get(i);
            
            // System.out.println("list--> "+l1+"\t"+l2);
            
            if(l1.size()!=l2.size())return false;
            
            int li=0,hi=l1.size()-1;
            int len = l1.size()-1;
            for(int j = 0 ; j<=len ;j++){
                int val1 = l1.get(j);
                int val2 = l2.get(hi-j);
                
                if(val1!=val2)return false ;
            }
            
        }
        
        return true;
        
    }
}
        
