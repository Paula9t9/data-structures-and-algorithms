package multiBracketValidation;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){

        Stack stack = new Stack();

        for(int i = 0; i < input.length(); i++){

            char characterToCheck = input.charAt(i);

            // If character is an open bracket, store it in our stack,
            // if it's a closing bracket, check it against out stack
            // otherwise, move on to the next character
            if(characterToCheck == '(' || characterToCheck == '[' || characterToCheck == '{' ){
                stack.push(characterToCheck);
            } else if (characterToCheck == ')' || characterToCheck == ']' || characterToCheck == '}' ){
                char stackChar = (char) stack.peek();

                // If the closing bracket matches our most recent open bracket, pop the bracket and continue.
                // Otherwise, we know the set is unbalance and return false
                switch(characterToCheck){
                    case ')':
                        if (stackChar == '('){
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ']':
                        if (stackChar == '['){
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (stackChar == '{'){
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    default:
                        // We shouldn't hit this default since we already checked for a bracket. If we hit it,
                        // something is wrong.
                        throw new IllegalStateException("Unexpected value: " + characterToCheck);
                }

            }
        }

        // Once we are done, check if the stack is empty. If it is, we are balanced. If not, unbalanced.
        if(stack.empty()){
            return true;
        } else {
            return false;
        }
    }
}
