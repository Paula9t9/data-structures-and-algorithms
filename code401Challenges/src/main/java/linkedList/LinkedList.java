package linkedList;

import java.util.ArrayList;

public class LinkedList {

    // I used this as a reference to figure out how to get the next memory address in Java.
    // https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/

    Node head = null;


    // inserts a new node at the front of the list
    public void insert(int value) {

        //If no head, instantiate head and add first value
        //otherwise, add new value after existing head
        if (this.head == null){
            Node newNode = new Node(value);
            head = newNode;
        }else {
            Node newNode = new Node(value, head);
            head = newNode;
        }
    }

    // inserts a new node between the prevNode and the nextNode.
    public void insert(int value, Node nextNode, Node prevNode) {

        //if nextNode is null, add to the end of the list
        if(nextNode == null){
            Node newNode = new Node(value);
            prevNode.nextNode = newNode;
        }else {
            Node newNode = new Node(value, nextNode);
            prevNode.nextNode = newNode;
        }

    }


    // finds first occurrence of a value in the list and inserts the new value before that value
    // if value not found, insert at the front of the list
    public void insertBefore(int valueToFind, int valueToInsert){

        if(this.includes(valueToFind)){

            Node currentNode = this.head;

            while(currentNode != null){
                if( currentNode.nextNode.value == valueToFind){
                    insert(valueToInsert, currentNode.nextNode, currentNode);
                    break;
                }
                currentNode = currentNode.nextNode;
            }
        }else {
            insert(valueToInsert);
        }
    }


    // Returns an arrayList of all the items in a list
    public String printValues(){

        StringBuilder linkedListStringBuilder = new StringBuilder();

        Node currentNode = this.head;

        if(this.head == null){
            linkedListStringBuilder.append("List is empty. Head points to ");
        }else {
            linkedListStringBuilder.append("List contains the following values:\n");
            while (currentNode != null){
                linkedListStringBuilder.append(currentNode.value);
                linkedListStringBuilder.append("->");
                currentNode = currentNode.nextNode;
            }
        }
        linkedListStringBuilder.append("null");
        return linkedListStringBuilder.toString();

    }


    public ArrayList<Node> getListOfNodes(){

        ArrayList<Node> nodeArrayList = new ArrayList<>();
        Node next = this.head;

        while (next != null){
            nodeArrayList.add(next);
            next = next.nextNode;
        }
        return nodeArrayList;
    }


    //Checks to see if a value is in the list
    public boolean includes(int valueToFind){

        boolean found = false;
        Node next = this.head;

        while(next != null){
            if(next.value == valueToFind){
                found = true;
                break;
            }
            next = next.nextNode;
        }

        return found;
    }

}
