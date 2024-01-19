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
    public int kthSmallest(TreeNode root, int k) {
          int count = countNodes(root.left);
          if (k <= count) {
              return kthSmallest(root.left, k);
          } else if (k > count + 1) {
              return kthSmallest(root.right, k - 1 - count); // 1 is counted as current node
          }

          return root.val;
      }

      public int countNodes(TreeNode n) {
          if (n == null) return 0;

          return 1 + countNodes(n.left) + countNodes(n.right);
      }
    
    
    /**
    Recursive Solution 
    
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    
    */
}