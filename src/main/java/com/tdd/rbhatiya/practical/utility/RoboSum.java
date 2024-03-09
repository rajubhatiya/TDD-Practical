package com.tdd.rbhatiya.practical.utility;

public class RoboSum {
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        int[] result = twoSum(nums, target);
//        for(int i=0;i<result.length;i++)
//            System.out.println(result[i]);
//        int[] nums = {3, 2, 4};
//        int target = 6;
//        twoSumOfIndex(nums,target);
        int[] nums = {3, 2, 4, 4, 5, 2};
        int val = 4;
        // removeElement(nums, val);
        removeduplicates(nums, val);
    }

    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    public static int[] twoIndexOfSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     */
    public static void twoSumOfIndex(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(result[0] + "," + result[1]);
                }
            }
        }
    }

    /**
     * Input  : a[] = {1, 1, 2, 2, 2}
     * Output : a[] = {1,2}
     * new size = 2
     */
    public static int removeduplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        for (int k = 0; k < temp.length; k++) {
            System.out.println(temp[k]);
        }

        return j;
    }

}
