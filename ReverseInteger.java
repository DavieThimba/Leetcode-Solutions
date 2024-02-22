package org.example;

public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;

            if(result == Integer.MAX_VALUE / 10 && digit > 7) {
                return  0;
            }

            if(result == Integer.MIN_VALUE / 10 && digit < -8) {
                return 0;
            }

            // Update result by appending the last element
            result = result * 10 + digit;

            // remove the last element from x
            x /= 10;
        }
        return result;
    }
}
