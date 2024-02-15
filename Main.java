package org.example;
public class Main{
    public static void main(String[] args) {
        Binary solution = new Binary();
        ArrListLen list = new ArrListLen();

        int n = 1401;
        int[] A = {2,3,4,5,6,7,6,544,3,34,222,344,234};

        int result = solution.solution(n);
        int result1 = list.solution(A);

        System.out.println("Longest binary: "+result);

        System.out.println("Length of the list: " + result1);
    }
}