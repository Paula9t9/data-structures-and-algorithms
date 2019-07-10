package repeatedWord;

import hashTable.HashTable;

public class RepeatedWord {


    public static String repeatedWord(String originalString){
        String[] wordArray = originalString.split(" ");
        HashTable wordsSoFar = new HashTable(wordArray.length * 2);

        for(String word : wordArray){
            //Sanitize the word for better comparison.
            //Used Geeks for Geeks to figure out how to strip punctuation:
            // https://www.geeksforgeeks.org/removing-punctuations-given-string/
            word = word.replaceAll("\\p{Punct}","");

            word = word.toLowerCase();

            //Check if we have encountered this word already, and proceed accordingly
            if (wordsSoFar.contains(word)){
                return word;
            }else {
                wordsSoFar.add(word, word);
            }
        }

        //We made it through all the words and found no repeats. Return an empty string
        return "";

    }
}
