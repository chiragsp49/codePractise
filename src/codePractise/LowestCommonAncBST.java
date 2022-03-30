package codePractise;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
//https://www.youtube.com/watch?v=6POfA8fruxI
public class LowestCommonAncBST {
	
	 //Definition for a binary tree node.
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(p.val<root.val && q.val<root.val) {
			return lowestCommonAncestor(root.left, p, q);
		}
		
		if(p.val>root.val && q.val>root.val) {
			return lowestCommonAncestor(root.right, p, q);
		}
		
		return root;
    }

}
