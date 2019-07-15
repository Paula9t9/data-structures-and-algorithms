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


    public HashSet<GraphNode> getNodes(){
        return this.nodes;
    }

    public ArrayList getNeighbors(GraphNode node){
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        for ( Object edge : node.getEdges()){
            GraphNode[] nodes = ((Edge) edge).getNodes();
            if(nodes[0] != node){
                neighbors.add(nodes[0]);
            } else if (nodes[1] != node){
                neighbors.add(nodes[1]);
            }
        }

        return neighbors;
    }

    public int size(){
        return -1;
    }

}
