package fizzBuzzTree;

import tree.BinaryTree;
import tree.TreeNode;

public class FizzBuzzTree {

    // Takes in a tree and iterates through all the nodes. If the value is divisible by 3 and 5, it is replaced with
    // the String "FizzBuzz"
    // If the value is only divisible by 3, we replace with "Fizz, by 5, "Buzz". Otherwise, we leave it alone.
    public BinaryTree fizzBuzzTree(BinaryTree inputTree){

        try {
            fizzBuzzHelper(inputTree.getRoot());
        }catch (NumberFormatException e){
            System.out.println("The provided Strings could not be converted to ints");
        }catch (IllegalArgumentException e){
            System.out.println("The value found in the provided tree was not of type Integer or String. Please try " +
                    "again" +
                    " with a tree containing only those value types.");
        }

        return inputTree;
    }

    // Used this for guidance on parsing strings. Includes why we're throwing NumberFormatException
    // https://www.mkyong.com/java/java-convert-string-to-int/
    private void fizzBuzzHelper(TreeNode currentNode) throws NumberFormatException, IllegalArgumentException{

        Integer currentValue;

        // Check if the node contains an Integer, a string, or none of the above
        if(currentNode.getValue() instanceof String){
                currentValue = Integer.parseInt( (String) currentNode.getValue());
        }else if (currentNode.getValue() instanceof Integer){
            currentValue = (Integer) currentNode.getValue();
        }else{
            throw new IllegalArgumentException("Provided input was not of type Integer or String");
        }

        // Set the value according to challenge parameters (see fizzBuzzTree method comment)
        if( Math.floorMod(currentValue, 5) == 0 && Math.floorMod(currentValue, 3) == 0){
            currentNode.setValue("FizzBuzz");
        }else if(Math.floorMod(currentValue, 3) == 0){
            currentNode.setValue("Fizz");
        }else if(Math.floorMod(currentValue, 5) == 0){
            currentNode.setValue("Buzz");
        }

        // Repeat the process for any children
        if(currentNode.getLeftChild() != null){
            fizzBuzzHelper(currentNode.getLeftChild());
        }
        if(currentNode.getRightChild() != null){
            fizzBuzzHelper(currentNode.getRightChild());
        }
    }
}
