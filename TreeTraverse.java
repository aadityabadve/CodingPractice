import java.util.LinkedList;
import java.util.Queue;

public class TreeTraverse {
	public static void main(String[] args) {
		TreeNode n = initialiseTree(10);
		printTree(n);
		

	}

	private static void printTree(TreeNode n) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(n);
		while(!q.isEmpty()){
			TreeNode temp = q.poll();
			System.out.println(temp.node);
			q.add(temp.left);
			q.add(temp.right);
		}
	}

	private static TreeNode initialiseTree(int i) {
		int value = 0;
		TreeNode n = new TreeNode(value);
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(n);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			temp.left = new TreeNode(value++);
			temp.right = new TreeNode(value++);
			q.add(temp.left);
			q.add(temp.right);
			if (value >= i) {
				break;
			}
		}
		return n;
	}
}
