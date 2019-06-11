package queueWithStacks;

import linkedList.Node;
import stacksAndQueues.Stack;

import java.util.ArrayList;

public class PseudoQueue {

    Stack inputStack;
    Stack outputStack;

    public PseudoQueue() {
        this.inputStack = new Stack();
        this.outputStack = new Stack();
    }

    public void enqueue(int value){
        this.inputStack.push(value);
    }

    public int dequeue(){

        while(!inputStack.isEmpty()){
            outputStack.push(inputStack.pop());
        }

        int valueToBeReturned = outputStack.pop();

        while(!outputStack.isEmpty()){
            inputStack.push(outputStack.pop());
        }
        return valueToBeReturned;
    }

    public ArrayList<Node> getPsuedoQueueNodes(){
        return inputStack.getStackNodes();
    }
}
