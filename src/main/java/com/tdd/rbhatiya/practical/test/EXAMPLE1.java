package com.tdd.rbhatiya.practical.test;

public class EXAMPLE1 {
    public static void main(String[] args) {
        reverseString("The sky is blue, the sun is shining!");
        System.out.println("------");
        reverseString("Hello    world.");
    }

    /**
     * Reverse the words in the sentence while maintaining
     * the position of the punctuation relative to the words.
     *
     * @param str Input:The sky is blue, the sun is shining!
     *            <p>
     *            Output:ehT yks si eulb, eht nus si gninihs!
     *            <p>
     *            Explanation:Original sentence: 'The sky is blue, the sun is shining!'
     *            Reversed sentence with preserved punctuation: 'ehT yks si eulb, eht nus si gninihs!'
     */
    public static void reverseString(String str) {
        // Input:The sky is blue, the sun is shining!
        // Output:ehT yks si eulb, eht nus si gninihs!
        String[] strArray = str.split(" ");
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
    }

    public static void reverseWordsFromString(String str) {
        String[] strArray = str.split(" ");
        for (int j = 0; j < strArray.length; j++) {
            String[] wordArray = new String[]{strArray[j]};
            for (int i = wordArray.length - 1; i >= 0; i--) {
                System.out.print(wordArray[i]);
            }
        }
    }

    /*
    Handle multiple spaces between words and leading/trailing spaces in the sentence.
     */
    public static void handleMultipleSpaces(String str) {
        String[] strArray = str.split(" ");
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
    }

    /*
    Avoid using built-in functions that directly reverse strings or split words (e.g., reverse() or split()).
     */
    public static void avoidUsingBuiltInFunctions(String str) {
        char[] strArray = str.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
    }

    /*
    Maintain the time complexity of the solution to O(n), where n is the length of the input sentence.
     */
    public static void maintainTimeComplexity(String str) {
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
    }

    /*
    Handle punctuation marks and spaces in the sentence.
     */
    public static void handlePunctuationMarksAndSpaces(String str) {
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
    }

    /*
    Handle punctuation marks and spaces in the sentence.
     */
    public static void handlePunctuationMarksAndSpaces2(String str) {
        char[] strArray = str.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
    }

    /*
    Handle punctuation marks and spaces in the sentence.
     */
}
