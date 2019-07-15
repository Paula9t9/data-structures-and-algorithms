package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    GraphNode testNode;
    Graph testGraph;

    @Before
    public void setUp() throws Exception {
        testGraph = new Graph();
        testNode = new GraphNode("A");
    }

    @Test
    public void testAddNode() {
        //TODO: build equality override for GraphNode for proper comparison

        GraphNode newNode = testGraph.addNode("A");

        assertEquals("Values should match", testNode.getValue(), newNode.getValue());
    }

    @Test
    public void getNodes() {
    }

    @Test
    public void getNeighbors() {
    }

    @Test
    public void size() {
    }
}