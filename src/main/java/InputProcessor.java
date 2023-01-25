package main.java;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

public class InputProcessor {
    /** Takes in a String "s" and filters WordList based off of the guess
     * If the String "s" is an invalid guess based off of the constructor for the Guess class, then
     * it returns that the input was erroneous
     *
     * @param s The string that is about to be examined
     */
    public static void takeInput (String s) {
        Guess g;
        try {
            System.out.println("aaa");
            g = new Guess(s);
            System.out.println("guess created");
            WordList.processGuess(g);
            System.out.println("Success!");


        } catch (Exception e) {
            // Something to handle erroneous output
            System.out.println("FAILURE!!!");
        }
    }

    public static List getList () {
        return WordList.getList();
    }

    public static String[] getRandomWords (int x) {
        String[] s = new String[x];
        Random r = new Random();

        for (int i = 0; i != x; i ++) {
            System.out.println("s");
            s[i] = (String) WordList.getList().get(r.nextInt(WordList.getList().size()));
        }

        return s;
    }

    public static String[] getSuggestions () {
        String[] s = {"ADIEU", "AUDIO", "RAISE", "SOARE", "STARE", "TREAD"};
        return s;
    }

    public static void main (String args[]) throws FileNotFoundException {
        WordList.initialize();
        String[] n = getRandomWords(10);
        for (String s : n) {
            System.out.println(s);
        }
    }
}
