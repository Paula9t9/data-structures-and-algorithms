package graph;

import java.util.ArrayList;

public class GraphNode<T> {

    private T value;
    private ArrayList<Edge> edges;

    public GraphNode(T value) {
        this.value = value;
        this.edges = new ArrayList<>();
    }

    public GraphNode() {
        this.edges = new ArrayList<>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public void addEdge(Edge newEdge){
        this.edges.add(newEdge);
    }

    public void removeEdge(Edge badEdge){
        this.edges.remove(badEdge);
    }
}
