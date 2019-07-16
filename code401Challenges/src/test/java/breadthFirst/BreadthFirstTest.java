package breadthFirst;

import graph.Graph;
import graph.GraphNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void breadthFirst() {

        Graph testGraph = new Graph();
        GraphNode firstNode =  testGraph.addNode("A");
        GraphNode bNode = testGraph.addNode("B");
        GraphNode cNode =testGraph.addNode("C");
        GraphNode dNode =testGraph.addNode("D");

        testGraph.addEdge(firstNode, bNode, 1);
        testGraph.addEdge(bNode, cNode, 1);
        testGraph.addEdge(bNode, dNode, 1);

        String expectedString = "ABCD";

        assertEquals("Should put all values from graph into a string", expectedString,
                BreadthFirst.breadthFirst(firstNode));
    }
}