# Graphs
An implementation of the graph data structure.

## Challenge
For this challenge, we had to implement a graph, complete with weighted edges. 

## Approach & Efficiency
For this implementation, I decided to have each node remember its own edges, and the graph simply has to remember its
 nodes. 

## API

####addNode(T value)

Add a node to the graph. 

####addEdge(GraphNode node1, GraphNode node2, T weight)

Add an edge between two nodes

####getNodes()

Get all the nodes in the graph. 

####getNeighbors

get all the neighnors for a node

####size() - (Coming soon)

get the size of the graph.