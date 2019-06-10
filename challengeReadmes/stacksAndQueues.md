# Stacks and Queues
A stack and a queue with basic push/pop, dequeue/enqueue, and peek functionality.

## Challenge
Our challenge was to manually build our own stacks and queues. We did have the option to build on top of our Linked 
List functionality. 

## Approach & Efficiency
For this challenge, I built my Stack and Queue on top of my Linked List functionality. 

Linked List handles all basic insert/append logic, which means that insert works with a O(1), and append works with O
(n).

Stack has additional functionality to track the front of the list and reassign the internal list's head in the case 
of a pop. Pop works with O(1)

Queue has additional functionality to track the front/back of the list for enqueuing and dequeuing. These functions 
add all incoming values to the back and removes values from the front. 

Both Stack and Queue have peek functions to see the value at the front of the list without removing that value from 
the list. 

## API

### Stack

#### Constructors: 

Can initialize empty  

    Stack() 

or pass in the first int value to be added 

    Stack(5)
    
    
#### Methods 

    push(int value)
    
   Add a value to the front of the list. 
   
    pop()
    
   Remove the first value from the list.
   
    peek()
    
   Returns the value found at the top of the list. (Does not change or remove it).
   
    getStackNodes()
    
   Returns an ArrayList of all nodes in the Stack.
   
   ___
### Queue

#### Constructors: 

Can initialize empty  

    Queue() 

or pass in the first int value to be added 

    Queue(5)
    
    
#### Methods 

    enqueue(int value)
    
   Add a value to the back of the list. 
   
    dequeue()
    
   Remove a value from the front of the list. 
   
    peek()
       
   Returns the value found at the top of the list. (Does not change or remove it).
   
    getQueueNodes()
       
   Returns an ArrayList of all nodes in the Queue.