package org.example;

public class IsPalindrom {
    public boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        String reversedString = new StringBuilder(xString).reverse().toString();

        return xString.equals(reversedString);
    }

    public boolean isPalindrome1(int x) {
        String xString = Integer.toString(x);
        String reversedString = new StringBuilder(xString).reverse().toString();

        return xString.equals(reversedString);
    }
}
