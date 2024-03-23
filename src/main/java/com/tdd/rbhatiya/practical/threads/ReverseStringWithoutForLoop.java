package com.tdd.rbhatiya.practical.threads;

public class ReverseStringWithoutForLoop {
    public static void main(String[] args) {
        String str = "Hello this is test";
      //  System.out.println(new StringBuilder(str).reverse());
      String reverse = reverseStringWithRecursion(str);
        System.out.println(reverse);
    }

    public static String reverseStringWithRecursion(String str) {
        if (str.isEmpty())
            return str;
        return reverseStringWithRecursion(str.substring(1)) + str.charAt(0);
    }
}
