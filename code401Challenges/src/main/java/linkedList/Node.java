package linkedList;

import java.util.ArrayList;

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

    //override array list equals for proper comparison
//    @Override
//    public boolean equals (Node thatNode){
//
//        if(this.value == thatNode.value){
//            return true;
//        }else {
//            return false;
//        }
//    }


}
