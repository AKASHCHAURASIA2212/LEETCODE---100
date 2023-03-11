/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
//     public TreeNode helper(int[][] arr , int lo ,int hi){
//         if(hi<lo){
//             return null;
//         }
//         int mid = (lo+hi)/2;
        
//         TreeNode  root = new TreeNode();
//         int[] rootdata = arr[mid];
//         root.val = rootdata[0];
        
        
//         root.left = helper(li,lo,mid-1);
//         root.right = helper(li,mid+1,hi);
    
//         return root;
            
//     }
    
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map = new HashMap<>();
        for(int[] node : descriptions){
            int root = node[0];
            int child = node[1];
            int isLeft = node[2];
            
            if(map.containsKey(root)==false){
                TreeNode rn = new TreeNode();
                rn.val = root;
                
                if(map.containsKey(child)==false){
                    TreeNode cn = new TreeNode();
                    cn.val = child;
                    
                    if(isLeft==1){
                        rn.left = cn;
                    }else{
                        rn.right = cn;
                    }
                    
                    map.put(child,cn);
                
                }else{
                    TreeNode cn = map.get(child);
                    if(isLeft==1){
                        rn.left = cn;
                    }else{
                        rn.right = cn;
                    }
                }
                map.put(root,rn);
            }else{
                TreeNode rn = map.get(root);
                rn.val = root;
                
                if(map.containsKey(child)==false){
                    TreeNode cn = new TreeNode();
                    cn.val = child;
                    
                    if(isLeft==1){
                        rn.left = cn;
                    }else{
                        rn.right = cn;
                    }
                    
                    map.put(child,cn);
                
                }else{
                    TreeNode cn = map.get(child);
                    if(isLeft==1){
                        rn.left = cn;
                    }else{
                        rn.right = cn;
                    }
                }
            }
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int[] node:descriptions){
            set.add(node[0]);
            set.add(node[1]);   
        }
        
        for(int[] node:descriptions){
            set.remove(node[1]);   
        }
        System.out.println(set);
        TreeNode myroot = null;
        for(int x : set){
            System.out.println(set);
           myroot = map.get(x);
        }
        System.out.println(map);
        return myroot;
        
        
    }
}