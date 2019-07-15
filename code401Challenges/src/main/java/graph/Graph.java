package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph<T> {

    //Just need to track the nodes. Nodes will track their own edges
    HashSet<GraphNode> adjacencyList;

    public GraphNode addNode(T value){
        GraphNode newNode = new GraphNode(value);
        return newNode;
    }

    public void addEdge(){};

    public ArrayList getNodes(){
        return new ArrayList();
    }

    public ArrayList getNeighbors(){
        return new ArrayList();
    }

    public int size(){
        return -1;
    }

}
