package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        /* to be implemented in part (a) */
        allPairs = new ArrayList<WordPair>();
        for(int i=0;i<words.length;i++){
            for( int n=i+1;n<words.length;n++){
                allPairs.add(new WordPair(words[i],words[n]));
            }
        }
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int count = 0;
        /* to be implemented in part (b) */
        for( WordPair pair:allPairs){
            if(pair.getFirst().equals(pair.getSecond())){
                count++;
            }
        }
        return count;
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
