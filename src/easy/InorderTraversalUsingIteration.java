package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalUsingIteration {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<>();

		Stack<TreeNode> treeNodes = new Stack<>();
		TreeNode curr = root;

		while (curr != null || treeNodes.size() > 0) {
			while (curr != null) {
				treeNodes.push(curr);
				curr = curr.left;
			}
			curr = treeNodes.pop();
			result.add(curr.val);
			curr = curr.right;
		}

		return result;
	}

	public static void main(String[] args) {
		TreeNode p = new TreeNode(2, new TreeNode(1), new TreeNode(3, null, new TreeNode(4)));
		TreeNode q = new TreeNode(4, new TreeNode(1), new TreeNode(5, new TreeNode(3), new TreeNode(6)));

		InorderTraversalUsingIteration st = new InorderTraversalUsingIteration();
		System.out.println(st.inorderTraversal(p));
		System.out.println(st.inorderTraversal(q));
	}
}
