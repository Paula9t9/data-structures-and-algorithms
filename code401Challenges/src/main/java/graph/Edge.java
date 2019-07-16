package graph;

public class Edge<T> {

    private GraphNode otherNode;
    private T weight;

    public Edge(GraphNode otherNode) {
        this.otherNode = otherNode;
    }

    public Edge(GraphNode otherNode, T weight) {
        this.otherNode = otherNode;
        this.weight = weight;
    }

    public GraphNode getOtherNode() {
        return otherNode;
    }

    public void setOtherNode(GraphNode otherNode) {
        this.otherNode = otherNode;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
}
