package linkedList;

public class LinkedList {

    // I used this as a reference to figure out how to get the next memory address in Java.
    // https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/

    Node head = null;


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

    

}
