package hashTable;

import java.lang.reflect.Array;

public class HashTable {

    private HashNode[] array;

    public HashTable(int size) {
        this.array = new HashNode[size];
    }

    public void add(String key, String value){

        int index = hash(key);
        if(array[index] == null){
            array[index] = new HashNode(key, value);
        }else {
            HashNode temp = array[index];
            array[index] = new HashNode(key, value);
            array[index].nextNode = temp;
        }
    }

    public String get(String key){
        int hashkey = hash(key);
        if(array[hashkey] == null){
            return null;
        }else {
            HashNode currentNode = array[hashkey];
            while(currentNode != null){
                if(currentNode.key == key){
                    return currentNode.getValue();
                }else {
                    currentNode = currentNode.nextNode;
                }
            }
        }
        //Returns null if key wasn't found in the bucket
        return null;
    }

    public boolean contains(String key){
        int hashkey = hash(key);
        if(array[hashkey] == null){
            return false;
        }else {
            HashNode currentNode = array[hashkey];
            while(currentNode != null){
                if(currentNode.key == key){
                    return true;
                }else {
                    currentNode = currentNode.nextNode;
                }
            }
            return false;
        }
    }

    public int hash(String key){
        int hashValue = 0;
        //for each character, get the character value and add it to the hashValue
        //Derived from John's Demo:
        // https://github.com/codefellows/seattle-java-401d4/blob/master/class-29/demo/hashmap/src/com/company/HashTable.java
        char[] letters = key.toCharArray();

        for(int i = 0; i < letters.length; i++){
            hashValue += letters[i];
        }

        hashValue = Math.floorMod((hashValue * 599), array.length);

        return hashValue;
    }
}
