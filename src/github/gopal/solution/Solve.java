/**
 * 
 */
package github.gopal.solution;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import github.gopal.structures.TreeNode;

/**
 * @author Gopal
 *
 */
public class Solve {

	private Solve() {
		// NOOP
	}

	public static void printVerticalSum(TreeNode root) {
		Map<Integer, Integer> solution = new TreeMap<Integer, Integer>();
		solveInternal(root, solution, 0);

		for (Entry<Integer, Integer> entry : solution.entrySet()) {
			System.out.println("Level : " + entry.getKey());
			System.out.println("Sum : " + entry.getValue());
		}

		System.out.println("Final Solution : ");
		System.out.println(solution.values());
	}

	private static void solveInternal(TreeNode node, Map<Integer, Integer> solution, Integer level) {
		if (node == null) {
			return;
		}
		Integer sum = solution.get(level);
		if (sum == null) {
			sum = node.getData();
		} else {
			sum += node.getData();
		}
		solution.put(level, sum);
		solveInternal(node.getLeft(), solution, (level - 1));
		solveInternal(node.getRight(), solution, (level + 1));
	}

}
