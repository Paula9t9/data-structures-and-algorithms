package treeIntersection;

import hashTable.HashTable;
import tree.BinaryTree;
import tree.TreeNode;

import java.util.ArrayList;

public class TreeIntersection {

    public static ArrayList<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2){

        ArrayList<Integer> resultsList = new ArrayList<>();

        //Store all nodes from first tree into list for comparison
        ArrayList<Integer> firstTreeList = tree1.preOrderTraversal(tree1.getRoot());


        TreeNode currentNode2 = tree2.getRoot();

        //Iterate through each node in second tree and store matching values in resultsList
        resultsList = checkDuplicates(currentNode2, resultsList, firstTreeList);

        return resultsList;
    }


    private static ArrayList<Integer> checkDuplicates(TreeNode currentNode, ArrayList resultSoFar,
                                                   ArrayList firstTreeList){

        int currentValue = (int) currentNode.getValue();

        if(firstTreeList.contains(currentValue) && !(resultSoFar.contains(currentValue))){
            resultSoFar.add(currentValue);
        }

        if(currentNode.getLeftChild() != null){
            resultSoFar.addAll(checkDuplicates(currentNode.getLeftChild(), new ArrayList(), firstTreeList));
        }

        if(currentNode.getRightChild() != null){
            resultSoFar.addAll(checkDuplicates(currentNode.getRightChild(), new ArrayList(), firstTreeList));
        }

        return resultSoFar;

    }
}
