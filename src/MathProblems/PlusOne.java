package MathProblems;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] a={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(a)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Start with a carry of 1 to add 1.

        // Traverse the digits array from right to left.
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Update the current digit.
            carry = sum / 10;    // Update the carry for the next iteration.

            if (carry == 0) {
                // If there's no carry, we can stop early.
                return digits;
            }
        }

        // If there's still a carry after the loop, it means we need to add a new digit.
        int[] result = new int[n + 1];
        result[0] = 1; // The leftmost digit is 1.
        System.arraycopy(digits, 0, result, 1, n); // Copy the original digits to the result.

        return result;
    }

}
