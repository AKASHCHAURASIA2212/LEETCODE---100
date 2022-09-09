/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public class Pair{
        TreeNode root ;
        int state;
        public Pair(){}
        public Pair(TreeNode root, int state){
            this.root=root;
            this.state=state;
        } 
    }
    
    public StringBuilder helper(TreeNode root,StringBuilder sb ) {
        
        if(root==null){
            sb.append(".");
            sb.append(" ");
            return sb ;
        }
        
        sb.append(root.val+" ");
        
        sb = helper(root.left,sb);
        sb = helper(root.right,sb);
        
        return sb ;
        
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        StringBuilder sb = new StringBuilder();
        sb = helper(root,sb);
        // System.out.println(sb);
        return sb.toString();
        
    }

    
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.charAt(0)=='.'){
            return null;
        }
        Stack<Pair> st = new Stack<>();
        String[] Data = data.split(" "); 
        TreeNode root = new TreeNode(Integer.parseInt(Data[0]));
        
        Pair mypair = new Pair(root,0);
        st.add(mypair);
        int i=1;
        while(st.size()>0 && i<data.length()){
            
            Pair rem = st.peek();
            // System.out.println(Data[i]);
            if(rem.state==0){
                if(Data[i].equals(".")==false) 
                {
                TreeNode left = new TreeNode(Integer.parseInt(Data[i]));
                rem.root.left=left;
                st.add(new Pair(left,0));
                }
                rem.state++;
                i++;
            }
            else if(rem.state==1){
                  if(Data[i].equals(".")==false) {
                TreeNode right = new TreeNode(Integer.parseInt(Data[i]));
                rem.root.right=right;
                st.add(new Pair(right,0));
                }
                rem.state++;
                i++;
            }
            else{
                st.pop();
                // i++;
            }
        }
       return root ; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));