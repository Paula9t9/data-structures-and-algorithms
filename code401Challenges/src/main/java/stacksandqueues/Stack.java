package stacksandqueues;

import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;

public class Stack {

    private Node top;
    LinkedList internalList = new LinkedList();


    public Stack(linkedList.Node top) {
        this.top = top;
        internalList.insert(this.top.getValue());
    }

    public Stack() {
        this.top = null;
    }

    public void push(int value){
        Node newNode = internalList.insert(value);
        this.top = newNode;
    }

    public int pop(){
        int poppedValue = this.top.getValue();
        this.top = this.top.getNextNode();
        internalList.setHead(this.top);
        return poppedValue;
    }

    // Return all nodes in an array list
    public ArrayList<Node> getStackNodes(){
        return internalList.getListOfNodes();
    }
}
