package com.tdd.rbhatiya.practical.utility;

public class ArrayUtil {
    public static void main(String[] args){
      //  ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1,2,3,4,5,6,7,8,9};
        printArray(array);
        System.out.println();
        int[] shiftedArray = shiftArray(array,8);
//        int[] reverseArray = reverseArray(array);
        printArray(shiftedArray);
//        System.out.println();
//        printArray(reverseArray);
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }

    public static int[] reverseArray(int[] array){
        int[] reverseArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            reverseArray[i] = array[array.length-i-1];
        }
        System.out.println(reverseArray);
        return reverseArray;
    }
    public static int[] shiftArray(int[] array,int shift){
        int[] shiftedArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            shiftedArray[i] = array[(i+shift)%array.length];
        }
        return shiftedArray;
    }


}
