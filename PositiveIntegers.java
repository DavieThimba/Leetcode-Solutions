package org.example;

import java.util.HashSet;
import java.util.Set;

public class PositiveIntegers {
    public int positiveIntegers(int[] A) {
        Set<Integer> positiveIntegers = new HashSet<>();

        for(int i : A) {
            if(i > 0) {
                positiveIntegers.add(i);
            }
        }

        int smallestPositive = 1;
        while(positiveIntegers.contains(smallestPositive)) {
            smallestPositive++;
        }
        return smallestPositive;
    }
}
