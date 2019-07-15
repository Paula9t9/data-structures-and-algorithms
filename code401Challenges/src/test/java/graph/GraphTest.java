package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph testGraph;
    GraphNode testNode;
    GraphNode bTestNode;


    @Before
    public void setUp() throws Exception {
        testGraph = new Graph();
        testNode = new GraphNode("A");
        bTestNode = new GraphNode("B");
    }

    @Test
    public void testAddNode() {
        //TODO: build equality override for GraphNode for proper comparison

        GraphNode newNode = testGraph.addNode("A");

        assertEquals("Values should match", testNode.getValue(), newNode.getValue());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddEdge_fail() {
        testGraph.addEdge(testNode, bTestNode, 1);
    }

    @Test
    public void testAddEdge_basic() {
        testNode = testGraph.addNode("A");
        bTestNode =  testGraph.addNode("B");

        Edge actualEdge = testGraph.addEdge(testNode, bTestNode, 1);
        Edge expectedEdge = new Edge(testNode, bTestNode, 1);

        assertArrayEquals("Edges should know their nodes", expectedEdge.getNodes(), actualEdge.getNodes());


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