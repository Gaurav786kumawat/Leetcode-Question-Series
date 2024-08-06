// ! 9. Palindrome Number - https://leetcode.com/problems/palindrome-number/description/
/*
 * Given an integer x, return true if x is a 
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class leetcode_9 {

    public static void main(String[] args) {
        int number = 121;
        
        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        
        // Print the result
        System.out.println("Is the number " + number + " a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        int new_number = x;
        int rev = 0;
        boolean checkPalindrome = false;
        while(x>0){
            int ld = x % 10;
            rev = rev * 10 + ld;
            x/=10;
        }
        if(new_number == rev){
            checkPalindrome = true;
        }

        return checkPalindrome;
    }
}
