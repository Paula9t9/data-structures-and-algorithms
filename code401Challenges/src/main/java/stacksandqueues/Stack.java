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

    public push(int value){
        internalList.insert(value);
        this.top = internalList.getHead();
    }

    public ArrayList<Node> getStackNodes(){
        return internalList.getListOfNodes();
    }
}
