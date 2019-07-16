package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

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

        testGraph.addEdge(testNode, bTestNode, 1);

        Edge actualEdge =  (Edge) testNode.getEdges().get(0);

        Edge expectedEdge = new Edge(bTestNode);

        //TODO: override equals methods for proper comparison
        assertEquals("Edges should know their nodes", expectedEdge.getOtherNode().getValue(),
                actualEdge.getOtherNode().getValue());


    }

    @Test
    public void getNodes() {
        testNode =  testGraph.addNode("A");
        bTestNode = testGraph.addNode("B");

        GraphNode[] testArray = new GraphNode[]{testNode, bTestNode};

        //TODO Override equals methods
        assertArrayEquals("Should return an array of nodes", testArray, testGraph.getNodes().toArray());
    }

    @Test
    public void getNeighbors() {

        testNode =  testGraph.addNode("A");
        bTestNode = testGraph.addNode("B");
        GraphNode cTestNode = testGraph.addNode("C");
        GraphNode dTestNode = testGraph.addNode("D");

        testGraph.addEdge(bTestNode, cTestNode, 1);
        testGraph.addEdge(bTestNode, dTestNode, 2);

        GraphNode[] testArray = new GraphNode[]{cTestNode, dTestNode};

        //TODO Override equals methods
        assertArrayEquals("Should return an array of nodes", testArray, bTestNode.getEdges().toArray());
    }

    @Test
    public void size() {
        testNode =  testGraph.addNode("A");
        bTestNode = testGraph.addNode("B");

        assertEquals("Should return the size of the array", 2, testGraph.size());

    }
}