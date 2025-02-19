package com.example.project.WordScramble;

import java.util.ArrayList;
import java.util.Arrays;

public class run{
    public static void main(String[] args) {
         ArrayList<String> testWordList = new ArrayList<String>(Arrays.asList("TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"));
        testWordList = WordScramble.scrambleOrRemove(testWordList);
        System.out.println(testWordList);
    }
}