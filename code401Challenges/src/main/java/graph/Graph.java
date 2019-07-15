package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph<T> {

    //Just need to track the nodes. Nodes will track their own edges
    HashSet<GraphNode> nodes;

    public Graph() {
        nodes = new HashSet<>();
    }

    public GraphNode addNode(T value){
        GraphNode newNode = new GraphNode(value);
        nodes.add(newNode);
        return newNode;
    }

    public Edge addEdge(GraphNode node1, GraphNode node2, T weight){
        Edge newEdge;
        //Nodes should already be in the graph, and not be null. If nodes is empty, they are definitely not in graph
        if(nodes != null && node1 != null && node2 != null && nodes.contains(node1) && nodes.contains(node2)){
            newEdge = new Edge(node1, node2, weight);
            node1.addEdge(newEdge);
            node2.addEdge(newEdge);
        }else {
            throw new IllegalArgumentException("Nodes must already be in graph.");
        }

        return newEdge;
    }


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
