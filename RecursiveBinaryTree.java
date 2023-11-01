package SS;

import java.util.Stack;

public class RecursiveBinaryTree<T extends Comparable<T>>{
	private TreeNode<T> root;
	
	public void insert(T value) {
		root = recursiveEx(root, value);
	}
	
	private TreeNode<T> recursiveEx(TreeNode<T> root, T value){
		//base case
		if(root == null) {
			root = new TreeNode<>(value);
			return root;
		}
		
		if(value.compareTo(root.getData())< 0) {
			root.setLeft(recursiveEx(root.getLeft(), value));
		}else if(value.compareTo(root.getData()) > 0) {
			root.setRight(recursiveEx(root.getRight(), value));
		}
		return root;
	}
	
	public void inOrderTraversal() {
	    Stack<TreeNode<T>> stack = new Stack<>();
	    inOrderTraversal(root, stack);
	}

	private void inOrderTraversal(TreeNode<T> node, Stack<TreeNode<T>> stack) {
	    if (node == null && stack.isEmpty()) {
	        return; // Both the node and the stack are empty, so we're done.
	    }

	    while (node != null) {
	        stack.push(node);
	        node = node.getLeft();
	    }

	    TreeNode<T> current = stack.pop();
	    System.out.print(current.getData() + " ");

	    inOrderTraversal(current.getRight(), stack);
	}



}