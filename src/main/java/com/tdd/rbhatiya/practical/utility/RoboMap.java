package com.tdd.rbhatiya.practical.utility;

import java.util.*;

public class RoboMap {

    public static void findMaxLength(){
        String str = "this is a test string";
        String[] words = str.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println(longestWord);
    }

    public static void findMaxLenghWord(){
        String str = """
                this is test link to find max characters word
                """;
        List<String> words = Arrays.asList(str.split(" "));
       String max = words.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(max);
    }

    public static void reverseString(){
        String str = "this is a test string";
        String[] words = str.split(" ");
        String reverseString = "";
        for(int i=words.length-1;i>=0;i--){
            reverseString += words[i]+" ";
        }
        System.out.println(reverseString);
    }
    public static void reverseWord(){
        String str = "string";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

    public static void swapNumbers(){
        int a=10;
        int b=30;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a+" and b = "+b);
    }
    public static void main(String[] args){
        swapNumbers();
       // reverseWord();
       // reverseString();
       // findMaxLenghWord();
 //       findMaxLength();
//        System.out.println(findPrime(13));
//        System.out.println(findPrime(10));
//        System.out.println(isPrime(13));
//        System.out.println(isPrime(10));
    }
    public static void binarySearch(int[] array, int x){
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == x) {
                System.out.println("Found at index " + mid);
                break;
            } else if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
  public static int[][] createMap(int x, int y){
        int[][] map = new int[x][y];
        return map;
    }

    public static void sumPain(){
        int[] a ={2,5,8,9};
        int sum=13;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==sum){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }

    public static boolean findPrime(int n){
        if(n==0 || n==1){
            return false;
        }
       for(int i=2;i<n/2;i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
    }
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void insertRobot(int[][] map, int x, int y){
        map[x][y] = 1;
    }
}
