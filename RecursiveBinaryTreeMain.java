package SS;

public class RecursiveBinaryTreeMain {
	public static void main(String[] args) {
		RecursiveBinaryTree<Integer> rbt = new RecursiveBinaryTree<Integer>();
		int[] values = {5,3,8,1,4,7,9,2,6,10};
		
		for(int value: values) {
			rbt.insert(value);
		}
		
		rbt.inOrderTraversal();
		
	}

}
