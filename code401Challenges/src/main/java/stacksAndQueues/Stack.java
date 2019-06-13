package stacksAndQueues;

import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;

public class Stack<T> {

    private Node top;
    LinkedList internalList = new LinkedList();


    public Stack(T firstValue) {
        //push will initialize top for us
        push(firstValue);
    }

    public Stack() {
        this.top = null;
    }

    public void push(T value){
        Node newNode = internalList.insert(value);
        this.top = newNode;
    }

    public T pop(){
        T poppedValue = (T) this.top.getValue();
        this.top = this.top.getNextNode();
        internalList.setHead(this.top);
        return poppedValue;
    }

    public T peek(){
        return (T) this.top.getValue();
    }

    // Return all nodes in an array list
    public ArrayList<Node> getStackNodes(){
        return internalList.getListOfNodes();
    }

    public boolean isEmpty(){
        if(this.top == null){
            return true;
        } else {
            return false;
        }
    }


}
