# Hashtables
A challenge from the Codefellows curriculum to manually build a hash table. 

## Challenge
For this challenge we had to manually build our own hash table, complete with methods for add, get, contains, and, of
 course, the hash method. 

## Approach & Efficiency
For this challenge, I took the straightforward approach of storing the keys in an array, and storing the values in a 
linked list. 

While I did do the initial scaffolding on my own, credit for the logic behind the hash function goes to 
our teacher John who recommended a simple hash algorithm in his [demo.](https://github.com/codefellows/seattle-java-401d4/blob/master/class-29/demo/hashmap/src/com/company/HashTable.java) 

## API

**add(String key, String value)**

Takes in a key and a value and stores them in the hash table. 

**get(String key)**

Takes in a key and returns the value found with that key. If nothing, returns null. 

**contains(String key)**

Checks if the hashtable contains a key. Returns a boolean accordingly. 