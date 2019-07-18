package depthFirst;

import graph.Graph;
import graph.GraphNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class DepthFirst {

    public static String depthFirst(GraphNode firsttNode){

        HashSet<GraphNode> visitedNodes = new HashSet();

        Stack<GraphNode> nodesToVisit = new Stack<>();

        nodesToVisit.push(firsttNode);

        StringBuilder stringBuilder = new StringBuilder();

        while(!nodesToVisit.isEmpty()){
            GraphNode currentNode = nodesToVisit.pop();
            visitedNodes.add(currentNode);

            for (GraphNode node : (ArrayList<GraphNode>) Graph.getNeighbors(currentNode)){
                if(!visitedNodes.contains(node)){
                    nodesToVisit.push(node);

                }
            }
            stringBuilder.append(currentNode.getValue());
        }

        return stringBuilder.toString();
    }
}
