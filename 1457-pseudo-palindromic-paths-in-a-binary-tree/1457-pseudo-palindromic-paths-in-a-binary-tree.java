class Solution {
    int res = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] count = new int[10];
        DFS(root, count);
        return res;
    }
    private void DFS(TreeNode root, int[] count) {
        if(root == null) return;
        count[root.val]++;
        DFS(root.left, count);
        if(root.left == null && root.right == null) {
            int odd = 0;
            // if ood < 2 break, improve performance
            for(int i = 1;i < 10 && odd < 2; i++)
                if (count[i] % 2 != 0)
                    odd++;
            if(odd < 2) res++;
        }
        DFS(root.right, count);
        count[root.val]--;
    }
}