package com.nisrulz.github.isomorphic_strings;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    /*
    Problem Statement:

        Two words are considered “friendly” if there exists a one to one mapping of letters between the two.

        For instance…

        GAGA and BOBO are friendly because mapping G<->B and A<->O would make them the same.

        HHHH and BOBO are not friendly. Neither are JKKJ and JKKJJ.

        This list…

        LALALA
        XOXOXO
        GCGCGC
        HHHCCC
        BBBMMM
        EGONUH
        HHRGOE


        … contains 5 words that have at least one friend.

     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = getStringListFromTextFile("words.txt");

        System.out.println("Total no. of words in the file: " + arrayList.size());
        System.out.println("Processing...");

        HashSet<String> hashSet = new HashSet<>();
        String firstVal, secondVal;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            firstVal = arrayList.get(i);
            for (int j = i + 1; j < arrayList.size(); j++) {
                secondVal = arrayList.get(j);
                if (areIsomorphic(firstVal, secondVal)) {
                    hashSet.add(firstVal);
                    hashSet.add(secondVal);
                    break;
                }
            }
        }

        System.out.println("No. of words in the list with at least one friend are: " + hashSet.size());
    }


    static private ArrayList<String> getStringListFromTextFile(String fileName) {
        fileName = new File("").getAbsolutePath() + "/src/com/nisrulz/github/isomorphic_strings/" + fileName;

        ArrayList<String> stringArrayList = new ArrayList<>();

        String line;

        try {
            FileReader fileReader =
                    new FileReader(fileName);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                stringArrayList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            ex.printStackTrace();
        }

        return stringArrayList;
    }

    // Function returns true if str1 and str2 are isomorphic
    static private boolean areIsomorphic(String s1, String s2) {

        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException();
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            if (!map.containsKey(s1.charAt(i))) {

                if (map.containsValue(s2.charAt(i))) {

                    return false;
                } else {
                    map.put(s1.charAt(i), s2.charAt(i));
                }
            } else {
                if (map.get(s1.charAt(i)) != s2.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
