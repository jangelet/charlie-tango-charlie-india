package trees.refbased;

public class TreeNode<T> {
	
	protected T item;
	protected TreeNode<T> leftChild;
	protected TreeNode<T> rightChild;
	
	public TreeNode(T item){//tree with no children
		this.item = item;
		leftChild = null;
		rightChild = null;
	}
	
	public TreeNode(T item, TreeNode<T> left,  TreeNode<T> right){
		this.item = item;
		leftChild = left;
		rightChild = right;
	}
	

}
