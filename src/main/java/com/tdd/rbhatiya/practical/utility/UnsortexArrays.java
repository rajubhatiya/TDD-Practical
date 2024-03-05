package com.tdd.rbhatiya.practical.utility;

public class UnsortexArrays {

    public static void main(String[] args) {
        unSortedAddrayAndMerge();
    }

    public static void unSortedAddrayAndMerge(){
        int[] arr1 = {2,1,4,3,5,6,7,9,8};
        int[] arr2 = {18,4,6,8,10,12,14,16,10};

        printArray(retunArr(arr1));
        System.out.println();
        printArray(retunArr(arr2));
        System.out.println();
        int[] mergeArray=mergeArray(arr1, arr2);
        System.out.println();
        printArray(removeDuplicatesFromArray(mergeArray));
//        sortArray(arr1);
//        System.out.println();
//        sortArray(arr2);
//        System.out.println();
//        mergeArray(arr1,arr2);
    }

  public static int[] removeDuplicatesFromArray(int[] arr){
      int[] arr1 = new int[arr.length];
      int j=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]<arr.length) {
              if (arr[i] != arr[i + 1] && arr[i]!=0) {
                  arr1[j++] = arr[i];
              }
          }
      }
      return arr1;
  }
    public static int[] retunArr(int[] arr){
       return sortArray(arr);
    }
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergedArray[k++] = arr1[i++];
            }else{
                mergedArray[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            mergedArray[k++] = arr1[i++];
        }
        while(j<arr2.length){
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+",");
//        }

        return arr;
    }
}
