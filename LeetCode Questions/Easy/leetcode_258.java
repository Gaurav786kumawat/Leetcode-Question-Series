// ! 258. Add Digits - https://leetcode.com/problems/add-digits/
/*
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.


Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 */

public class leetcode_258 {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    // public static int addDigits(int num) {
    // while (num >= 10) {
    // int sum = 0;
    // while (num > 0) {
    // int ld = num % 10;
    // sum += ld;
    // num /= 10;
    // }
    // num = sum;
    // }
    // return num;
    // }
    // ! OR
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }
}
