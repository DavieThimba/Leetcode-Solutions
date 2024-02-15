package org.example;

public class Binary {
    public int solution(int N){
        String binaryStr = Integer.toBinaryString(N);
        System.out.println("Binary represention: " + binaryStr);

        int currentGap = 0;
        int maxGap = 0;

        for(int i = 0; i < binaryStr.length(); i++) {
            int currentDigit = binaryStr.charAt(i);

            if(currentDigit == '0') {
                currentGap++;
            } else {
                maxGap = Math.max(maxGap,currentGap);
                currentGap = 0;  // reset
            }
        }
        return maxGap;
    }
}
