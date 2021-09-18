/*   https://leetcode.com/problems/binary-tree-level-order-traversal/
102. Binary Tree Level Order Traversal
Medium
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Example 3:

Input: root = []
Output: []
    
The number of nodes in the tree is in the range [0, 2000].
    -1000 <= Node.val <= 1000
*/
import java.util.PriorityQueue ;
import java.util.ArrayDeque ;
import java.util.ArrayList;
import java.util.List ;
import java.util.Queue ;

 class TreeNode {
	int value ;
	TreeNode left ;
	TreeNode right ;

	public TreeNode() { }
	public TreeNode(int value) {
		this.value = value ;
		this.left = null;
		this.right = null ;	
	}
	public TreeNode(int value,TreeNode left, TreeNode right) {
		this.value = value ;
		this.left  = left ;
		this.right = right; 
	}
}

class BinaryTreeLevelOrder {
	
	protected BinaryTreeLevelOrder() {}
   	
	protected List<Integer> getBirnaryTreeinLevelOrder(TreeNode root)
	{
		List<Integer> binaryTreeString = new ArrayList<>() ;
		TreeNode rootCopy = root ;
		
		if(root.left == null && root.right == null) {
			binaryTreeString.add(root.value) ;
			return binaryTreeString ;
		}
		//Queue<TreeNode> treeQ = new PriorityQueue<>() ;
		Queue<TreeNode> treeQ = new ArrayDeque<>() ;
		treeQ.offer(root) ;	

		//while(!(treeQ.isEmpty()) || !(rootCopy.left==null &&rootCopy.right==null) ) {
		while(!treeQ.isEmpty()) {
			rootCopy = treeQ.poll() ;
			binaryTreeString.add(rootCopy.value) ;
			if(rootCopy.left!= null)
				treeQ.offer(rootCopy.left);

			if(rootCopy.right!= null)
				treeQ.offer(rootCopy.right) ;
		}
		return binaryTreeString ;
	}	

}

public class BinaryTreeLevelOrderTraversal {

	//public static final Logger logger ;

	public static void main(String[] args) {
		//logger = LoggerFactory.getLogger(BinaryTreeLevelOrderTraversal.class) ;
		//logger.info("Logger Initialized") ;
		BinaryTreeLevelOrder bt = new BinaryTreeLevelOrder() ;
		TreeNode root  = new TreeNode(4) ;
		root.left      = new TreeNode(2) ;
		root.left.left = new TreeNode(1) ;
		root.left.right= new TreeNode(3) ;
		root.right     = new TreeNode(6) ;
		root.right.left= new TreeNode(5) ;
		root.right.right= new TreeNode(8) ;
		System.out.println("Tree: "+bt.getBirnaryTreeinLevelOrder(root)) ;	
	}
}




























