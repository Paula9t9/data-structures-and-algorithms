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
        // Initializes the front value if the list is empty
        if(this.front == null){
            this.front = newNode;
        }
        return newNode;
    }

    // Removes the first value in the list
    public int dequeue(){
        int dequeuedValue = front.getValue();
        front = front.getNextNode();
        internalList.setHead(front);
        return dequeuedValue;
    }

    // Returns the value at the front of the list (does not remove it)
    public int peek(){
        return this.front.getValue();
    }

    // Return all nodes in an array list
    public ArrayList<Node> getQueueNodes(){
        return internalList.getListOfNodes();
    }

}
