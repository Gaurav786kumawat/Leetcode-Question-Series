// ! 344 - Reverse String - https://leetcode.com/problems/reverse-string/description/
/*
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.


Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

public class leetcode_344 {
    public static void main(String[] args) {
        char s[] = { 'H', 'e', 'e', 'l', 'o' };
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int stIdx = 0;
        int endIdx = s.length - 1;
        while (stIdx < endIdx) {
            char temp = s[stIdx];
            s[stIdx] = s[endIdx];
            s[endIdx] = temp;
            stIdx++;
            endIdx--;
        }
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }
    }
}
