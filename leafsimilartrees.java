//Java Solution

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        
        dfs(root1, arr1);
        dfs(root2, arr2);
        
        if (arr1.size() != arr2.size()) {
            return false;
        }
        
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2.get(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public void dfs(TreeNode node, List arr) {
        if (node == null) {
            return;
        }
        
        if (node.left == null && node.right == null) {
            arr.add(node.val);
        }
        
        dfs(node.left, arr);
        dfs(node.right, arr);
    }
}