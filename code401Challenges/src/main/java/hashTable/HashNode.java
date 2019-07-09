package hashTable;

public class HashNode {

    String key;
    String value;
    HashNode nextNode;

    public HashNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HashNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(HashNode nextNode) {
        this.nextNode = nextNode;
    }
}
