/*
* DFS - Depth First Search Traversals: Pre-order, In-order, Post order. 
*/
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

class Travel {
	protected void PreOrder(TreeNode root)  {
		if(root==null) return ;

		System.out.print(root.value) ;
		PreOrder(root.left) ;
		PreOrder(root.right) ;
	}
	protected void InOrder(TreeNode root) {
		if( root==null ) return ;
		InOrder(root.left) ;
		System.out.print(root.value) ;
		InOrder(root.right) ;
	}
	protected void PostOrder(TreeNode root) {
		if( root==null ) return ;
		PostOrder(root.left) ;
		PostOrder(root.right) ;
		System.out.print(root.value) ;
	}
}


public class TreeTraversals{
	public static void main(String[] args) {
		TreeNode root  = new TreeNode(4) ;
		root.left      = new TreeNode(2) ;
		root.left.left = new TreeNode(1) ;
		root.left.right= new TreeNode(3) ;
		root.right     = new TreeNode(6) ;
		root.right.left= new TreeNode(5) ;
		root.right.right= new TreeNode(8) ;
		
		Travel tree = new Travel() ;
		tree.PreOrder(root) ;		
		System.out.println(" ") ;
		tree.InOrder(root) ;
		System.out.println(" ") ;
		tree.PostOrder(root) ;
	}
}




























