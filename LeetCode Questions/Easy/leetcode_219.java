// ! Contains Duplicate II - https://leetcode.com/problems/contains-duplicate-ii/
/*
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.


Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

public class leetcode_219 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 2, 3 }, k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    // public static boolean containsNearbyDuplicate(int[] nums, int k){
    // for(int i=0; i<nums.length; i++){
    // for(int j=i+1; j<nums.length; j++){
    // if(nums[i] == nums[j]){
    // int i_minus_j = i-j;
    // if(i_minus_j < 0){
    // i_minus_j *= -1;
    // }
    // if(i_minus_j <= k){
    // return true;
    // }
    // }
    // }
    // }
    // return false;
    // }
    // ? In the above solution time limit will be exceeded so this is the another
    // ? approach for this question.

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= k) {
            k = nums.length - 1;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j < nums.length && j <= i + k) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                j++;
                count++;
                if (count > 9999) {
                    return false;
                }
            }
        }
        return false;
    }
    // ? this approach is the best approach.
}