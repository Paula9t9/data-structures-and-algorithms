# Linked Lists Part 2
Adding new ways to add values to our linked list.

## Description

Three new methods were added as part of this challenge:

* **Append:** Adds a value to the end of the list.
* **insertBefore:** Finds first occurrence of a value in the list and inserts the new value before that value.
* **insertAfter:** Finds the first occurrence of a value in the list and inserts the new value after that value.


## Approach 

Append iterates through until a node's next value is null, then inserts the new node after the current value. 

insertBefore and insertAfter iterate through the list until they find the value they're looking for. Then they insert a new node before/after that node.

## Efficiency

* **Append:** O(n)
* **insertBefore:** O(n*2)
* **insertAfter:** O(n*2)

## Solution

[Link to Code](../code401challenges/src/main/java/linkedList/LinkedList.java)

[Link to Tests](../code401challenges/src/test/java/linkedList/LinkedListTest.java)

![Whiteboard Solution](./assets/LinkedListPt2_Whiteboard.jpg)
