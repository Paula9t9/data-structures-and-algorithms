package stacksandqueues;

import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;

public class Stack {

    private Node top;
    LinkedList internalList = new LinkedList();


    public Stack(int firstValue) {
        //push will initialize top for us
        push(firstValue);
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

    public int peek(){
        return this.top.getValue();
    }

    // Return all nodes in an array list
    public ArrayList<Node> getStackNodes(){
        return internalList.getListOfNodes();
    }


}
