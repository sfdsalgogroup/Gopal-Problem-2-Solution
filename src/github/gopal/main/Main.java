/**
 * 
 */
package github.gopal.main;

import github.gopal.solution.Solve;
import github.gopal.structures.TreeNode;
import github.gopal.util.TreeCreator;
import github.gopal.util.TreePrinter;

/**
 * @author Gopal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = TreeCreator.getOriginalTree();
		TreePrinter.printNode(root);

		Solve.printVerticalSum(root);
	}

}
