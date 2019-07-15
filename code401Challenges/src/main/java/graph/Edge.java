package graph;

public class Edge<T> {

    private GraphNode[] nodes = new GraphNode[2];
    private T weight;

    public Edge(GraphNode node1, GraphNode node2) {
        GraphNode[] newArray = {node1, node2};
        this.nodes = newArray;
    }

    public Edge(GraphNode node1, GraphNode node2, T weight) {
        GraphNode[] newArray = {node1, node2};
        this.nodes = newArray;
        this.weight = weight;
    }

    public GraphNode[] getNodes() {
        return nodes;
    }

    public void setNodes(GraphNode[] nodes) {
        this.nodes = nodes;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
}
