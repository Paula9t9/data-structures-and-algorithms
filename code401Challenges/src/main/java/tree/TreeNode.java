package tree;

public class TreeNode<T> {

    private T value;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public TreeNode() {
        value = null;
        leftChild = null;
        rightChild = null;
    }

    public TreeNode(T value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }

    public TreeNode(T value, TreeNode leftChild, TreeNode rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        String nodeString = this.value.toString();
        return nodeString;
    }
}
