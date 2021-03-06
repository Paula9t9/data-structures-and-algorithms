 # Breadth First Graph Traversal

 Traversing a graph breadth first. 

 ## Description

In an effort to become more familiar with graphs, we were tasked with traversing a graph breadth first.  

 ## Approach

To accomplish breadth first traversal, I add my first node to a queue called nodesToVisit. I also initialize a 
Hashset called visitedNodes. I also initialize a Stringbuilder to hold my values. 

Then, I have a while loop saying, "Keep going so long as nodesToVisit has nodes."

Within that loop, I remove the first node from the queue, and add it to my set of visited nodes. 

I then go through and check each of that node's neighbors. If they aren't in my visitedNodes set, I add them to the 
nodesToVisit queue. 

Then I add the value of my current node to the Stringbuilder and repeat the process until I run out of nodes. 

Then, I convert the Stringbuilder to a string and return it. 

 ## Efficiency

 O(n) for time

 O(n) for space since we will end up with a set containing all the nodes. 

 ## Solution

 [Link to Code](../code401Challenges/src/main/java/breadthFirst/breadthFirst.java)

[Link to Tests](../code401Challenges/src/test/java/breadthFirst/BreadthFirstTest.java)

