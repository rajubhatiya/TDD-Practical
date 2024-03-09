package com.tdd.rbhatiya.practical.utility;

public class SumPair {
    public static void main(String[] args) {
        sumPair();
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int sum = 10;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    System.out.println(arr[i] + " " + arr[j]);
//                }
//            }
//        }
    }

    public static void sumPair() {
        int[] arr = {10, 13, 7, 2};
        int sum = 15;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i]+" - "+arr[j]);
                if(arr[i]+arr[j]==sum){
                    System.out.println("Sum of element "+arr[i]+" and " +arr[j]+" is "+sum);
                }
            }
        }
    }
}
