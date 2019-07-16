package breadthFirst;

import graph.Graph;
import graph.GraphNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {

    public static String breadthFirst(GraphNode firsttNode){

        HashSet<GraphNode> visitedNodes = new HashSet();

        Queue<GraphNode> nodesToVisit = new LinkedList<>();

        nodesToVisit.add(firsttNode);

        StringBuilder stringBuilder = new StringBuilder();

        while(!nodesToVisit.isEmpty()){
            GraphNode currentNode = nodesToVisit.remove();
            visitedNodes.add(currentNode);

            for (GraphNode node : (ArrayList<GraphNode>) Graph.getNeighbors(currentNode)){
                if(!visitedNodes.contains(node)){
                    nodesToVisit.add(node);

                }
            }
            stringBuilder.append(currentNode.getValue());
        }

        return stringBuilder.toString();
    }
}
