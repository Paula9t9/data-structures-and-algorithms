package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>> {
    private TreeNode root;


    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T value) {
        root = new TreeNode(value);
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    // inserts a new node into the tree under the given parent. Must know ahead of time if we want to insert left or
    // right and communicate that with insertLeft boolean.
    // Will overwrite child values depending on instructions given via insertLeft
    private void addNode(TreeNode parentNode, T value, boolean insertLeft){
        if (insertLeft){
            TreeNode newNode = new TreeNode(value);
            parentNode.setLeftChild(newNode);
        } else {
            TreeNode newNode = new TreeNode(value);
            parentNode.setRightChild(newNode);
        }
    }

    // Finds where in the tree we want to add the value, and then inserts that value by calling addNode
    public void addSingleValue(T value){

        // if the root is null, create a new node with that value and be done
        if (this.root == null){
            this.root = new TreeNode(value);
            return;
        }

        TreeNode insertParent = findParentForInsert(this.root, value);

        // TODO: find a way for findParent to tell us node and left/right status for insert
        T parentValue = (T) insertParent.getValue();

        // If parent value is higher, insert new value as left child, otherwise insert as right child
        // Uses same comparison as findParent, so we are just verifying so we know what to tell addNode
        if(parentValue.compareTo(value) > 0){
            addNode(insertParent, value,true);
        } else {
            addNode(insertParent, value, false);
        }
    }


    // Finds the node where we want to insert our value.
    private TreeNode findParentForInsert(TreeNode currentNode, T valueToAdd){
        T currentValue = (T) currentNode.getValue();

        // Used this to figure out how to compare generics:
        // https://stackoverflow.com/questions/20793082/java-comparing-generic-types
        // Returns negative if less than, positive if greater than per java docs
        // https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html
        if(currentValue.compareTo(valueToAdd) > 0 ){
            // If the left child is null, then this is the node we want to add a child to
            // Otherwise, travel deeper down the rabbit hole
            if(currentNode.getLeftChild() == null){
                return currentNode;
            }else {
                return findParentForInsert(currentNode.getLeftChild(), valueToAdd);
            }
            // If the value to be inserted is less than the current value, we want to insert to the right.
            // check per same logic as above
        } else if (currentValue.compareTo(valueToAdd) <= 0 ){
            if(currentNode.getRightChild() == null){
                return currentNode;
            } else {
                return findParentForInsert(currentNode.getRightChild(), valueToAdd);
            }
        } else {
            System.err.println("Oops, there was an issue finding the correct node. Returning the node provided");
            return currentNode;
        }

    }


    // TODO: refactor to return true if successful
    // adds multiple values to the tree
    public void addValues(ArrayList<T> valueList){
        for (T value : valueList){
            this.addSingleValue(value);
        }
    }


    // Given a tree node, this traverses the tree by the left nodes first, storing all values in an array then
    // returning that array.
    public ArrayList<T> preOrderTraversal(TreeNode currentNode){


        ArrayList valueList = new ArrayList();

        valueList.add(currentNode.getValue());

        if(currentNode.getLeftChild() != null){
            valueList.addAll(preOrderTraversal(currentNode.getLeftChild()));
        }

        if(currentNode.getRightChild() != null){
            valueList.addAll(preOrderTraversal(currentNode.getRightChild()));
        }

        return valueList;

    }

    // Traverse a tree breadth first. In other words, level by level.
    public String breadthFirstTraversal(){
        Queue nodeQueue = new LinkedList();

        StringBuilder resultString = new StringBuilder();

        nodeQueue.add(this.root);
        TreeNode currentNode;

        while(!nodeQueue.isEmpty()){
            currentNode =  (TreeNode) nodeQueue.remove();
            resultString.append(currentNode.getValue());

            if(currentNode.getLeftChild() != null){
                nodeQueue.add(currentNode.getLeftChild());
            }
            if(currentNode.getRightChild() != null){
                nodeQueue.add(currentNode.getRightChild());
            }
        }

        System.out.println(resultString.toString());
        return resultString.toString();
    }


    @Override
    public String toString() {
        // print the value of each node
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("This tree contains the values: ");

        stringBuilder.append(toStringHelper(this.root));

        return stringBuilder.toString();


    }

    private StringBuilder toStringHelper(TreeNode currentNode){
        StringBuilder stringBuilder = new StringBuilder();

        // Get the string for the left child (children)
        if(currentNode.getLeftChild() != null){
            stringBuilder.append( toStringHelper(currentNode.getLeftChild()));
        }

        //Get the string for the right child (children)
        if(currentNode.getRightChild() != null){
            stringBuilder.append(toStringHelper(currentNode.getRightChild()));
        }

        stringBuilder.append(currentNode.getValue().toString());

        return stringBuilder;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
