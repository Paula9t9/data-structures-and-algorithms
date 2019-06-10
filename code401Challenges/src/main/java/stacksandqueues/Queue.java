package stacksandqueues;

import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;

public class Queue {

    private Node front;
    private Node back;
    private LinkedList internalList = new LinkedList();

    public Queue(){
        this.front = null;
        this.back = null;

    }

    public Queue(int firstValue){
        //enqueue initializes front and back for us
        enqueue(firstValue);
    }

    //Adds a new node to the back of the list. Returns the node for reference
    public Node enqueue(int value){
        Node newNode = internalList.append(value);
        this.back = newNode;
        if(this.front == null){
            this.front = newNode;
        }

        return newNode;
    }

    // Return all nodes in an array list
    public ArrayList<Node> getQueueNodes(){
        return internalList.getListOfNodes();
    }
}
