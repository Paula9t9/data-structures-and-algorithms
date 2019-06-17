# Trees
A Codefellows lab to get some practice with trees. 

## Challenge
For this lab, we were tasked with building our own binary trees with a node class and a binary tree class. 

We were also tasked with providing methods to traverse the tree in preOrder, inOrder, and postOrder. (Coming Soon)

## Approach & Efficiency
For this task, I took a meticulous approach. I built out my binary tree and nodes to work with generics, and as such 
any object that is stored in this structure must have a compareTo method. 
This is because the values are stored as 
a right/left child based on whether the value is greater or less than a parent value. 

## API

###Constructors:

   Empty Constructor:
   
    BinaryTree()
    
   Initialize with a generic value to be inserted: 
 
    BinaryTree(T value)
    
   
### Methods:

   Add a value to the tree.
   
    addSingleValue(T value)
    
   Add many values to the tree.

    addValues(ArrayList<T> valueList)
    
   Returns an array list according to Preorder Traversal
   
   (You can see 
   [these docs](https://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/) for reference on Preorder traversal)

    preOrderTraversal(TreeNode currentNode)

   Prints out all the values in the given tree
       
    toString()
    
    