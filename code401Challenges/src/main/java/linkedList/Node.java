package linkedList;

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


}
