package com.tdd.rbhatiya.practical.dsa;

/*
1.  Start
2.  Take input array and Target
3.  Initialise start = 0 and end = (array size -1)
4.  Intialise mid variable
5.  mid = (start+end)/2
6.  if array[ mid ] == target then return mid
7.  if array[ mid ] < target then start = mid+1
8.  if array[ mid ] > target then end = mid-1
9.  if start<=end then goto step 5
10. return -1 as Not element found
11. Exit

Methods for Java Binary Search
There are three methods in Java to implement Binary Search in Java are mentioned below:

Iterative Method
Recursive Method
Inbuild Method
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        binarySearch(arr, target);
    }

    /**
     * 1. Iterative Method for Binary Search  in Java
     * @param arr
     * @param target
     * @return
     *
     *  Returns index of x if it is present in arr[l....r], else return -1
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println(arr[mid]);
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
