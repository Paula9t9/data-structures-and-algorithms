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

    public void addEdge(GraphNode node1, GraphNode node2, T weight){
        Edge newEdge;
        //Nodes should already be in the graph, and not be null. If nodes is empty, they are definitely not in graph
        if(nodes != null && node1 != null && node2 != null && nodes.contains(node1) && nodes.contains(node2)){
            node1.addEdge(new Edge(node2));
            node2.addEdge(new Edge(node1));
        }else {
            throw new IllegalArgumentException("Nodes must already be in graph.");
        }

    }


    public HashSet<GraphNode> getNodes(){
        return this.nodes;
    }

    public ArrayList getNeighbors(GraphNode node){
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        for ( Object edge : node.getEdges()) {

            neighbors.add(((Edge) edge).getOtherNode());

        }
        return neighbors;
    }

    public int size(){
        return this.nodes.size();
    }

}
