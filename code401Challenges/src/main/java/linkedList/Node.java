package linkedList;

import java.util.ArrayList;
import java.util.Objects;

public class Node {

    int value;
    Node nextNode;

    public  Node (int value){
        this.value = value;
        this.nextNode = null;
    }

    public Node (int value, Node nextNode){
        this.value = value;
        this.nextNode = nextNode;
    }

    //Used this to figure out how to override equals so I can compare two lists of nodes
    // https://www.geeksforgeeks.org/overriding-equals-method-in-java/
    @Override
    public boolean equals (Object o){

        if(o == this){
            return true;
        }

        if(!(o instanceof Node)){
            return  false;
        }

        Node thatNode = (Node) o;

        if(this.value == thatNode.value && (Objects.equals(this.nextNode, thatNode.nextNode))){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString(){

        if(this.nextNode == null){
            return String.format("\nThis node has the value: %d, and points to node w/ value: %s", this.value,
                    "null");
        }
            return String.format("\nThis node has the value: %d, and points to node w/ value: %d", this.value,
                this.nextNode.value);
        }


}
