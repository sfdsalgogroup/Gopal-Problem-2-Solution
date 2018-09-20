/**
 * 
 */
package github.gopal.util;

import github.gopal.structures.TreeNode;

/**
 * @author Gopal
 *
 */
public class TreeCreator {

	private TreeCreator() {
		// NOOP
	}

	public static TreeNode getOriginalTree() {
		TreeNode root = new TreeNode();
		root.setData(1);

		TreeNode node2 = new TreeNode();
		node2.setData(2);

		TreeNode node3 = new TreeNode();
		node3.setData(3);

		TreeNode node4 = new TreeNode();
		node4.setData(4);

		TreeNode node5 = new TreeNode();
		node5.setData(5);

		TreeNode node6 = new TreeNode();
		node6.setData(6);

		TreeNode node7 = new TreeNode();
		node7.setData(7);

		root.setLeft(node2);
		root.setRight(node3);

		node2.setLeft(node4);
		node2.setRight(node5);

		node3.setLeft(node6);
		node3.setRight(node7);

		return root;
	}

}
