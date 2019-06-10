package linkedList;

import java.util.ArrayList;
import java.util.HashMap;

public class LinkedList {

    // I used this as a reference to figure out how to get the next memory address in Java.
    // https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/

    linkedList.Node head = null;
    private HashMap<Integer, Node> nodeMap;


    // inserts a new node at the front of the list, returns inserted node for reference
    public Node insert(int value) {

        //If no head, instantiate head and add first value
        //otherwise, add new value after existing head
        if (this.head == null){
            Node newNode = new Node(value);
            head = newNode;
            return newNode;
        }else {
            Node newNode = new Node(value, head);
            head = newNode;
            return newNode;
        }
    }

    // inserts a new node between the prevNode and the nextNode.
    public Node insert(int value, Node nextNode, Node prevNode) {

        //if nextNode is null, add to the end of the list
        if(nextNode == null){
            Node newNode = new Node(value);
            prevNode.nextNode = newNode;
            return newNode;
        }else {
            Node newNode = new Node(value, nextNode);
            prevNode.nextNode = newNode;
            return newNode;
        }

    }


    // Adds a value to the end of the list, returns appended node for reference
    // Returns null if it fails
    public Node append(int value){
        Node newNode = null;

        // If list is currently empty, just add to the list
        if(this.head == null){
            newNode = insert(value);
        } else {
            Node currentNode = this.head;
            while(currentNode != null){
                if(currentNode.nextNode == null){
                    newNode = insert(value, null, currentNode);
                    break;
                }
                currentNode = currentNode.nextNode;
            }
        }

        return newNode;
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


    // finds the first occurrence of a value in the list and inserts the new value after that value
    // if value not found, insert at the end of the list
    public void insertAfter(int valueToFind, int valueToInsert){

        if (this.includes(valueToFind)){
            //iterate through list to find value, then insert new value
            Node currentNode = this.head;

            while (currentNode != null) {
                if(currentNode.value == valueToFind){
                    insert(valueToInsert, currentNode.nextNode, currentNode);
                    break;
                }
                currentNode = currentNode.nextNode;
            }
        } else{
            append(valueToInsert);
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

    public int findFromEnd(int k){
        buildHashMap();
        return nodeMap.get(nodeMap.size() - k - 1).value;

    }


    //Stores the linked list nodes in a hashmap for easier lookup.
    //starts counting at 0
    private void buildHashMap(){
        nodeMap = new HashMap<>();
        Node currentNode = this.head;
        int index = 0;

        while(currentNode != null){
            nodeMap.put(index, currentNode);
            index ++;
            currentNode = currentNode.nextNode;
        }
    }


    //Merges two Linked Lists into one Linked List
    public LinkedList merge( LinkedList list2){

        Node list1CurrentNode = this.head;
        Node list2CurrentNode = list2.head;
        Node tempNode1;
        Node tempNode2;

        while(list1CurrentNode != null && list2CurrentNode != null){

            tempNode1 = list1CurrentNode.nextNode;
            tempNode2 = list2CurrentNode.nextNode;

            list1CurrentNode.nextNode = list2CurrentNode;
            list2CurrentNode.nextNode = tempNode1;

            list1CurrentNode = tempNode1;
            list2CurrentNode = tempNode2;

        }

        if (list1CurrentNode == null){
            list1CurrentNode = list2CurrentNode;
        } else if (list1CurrentNode != null){
            list2CurrentNode = list1CurrentNode;
        }
        return this;
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
