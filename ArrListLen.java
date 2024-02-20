package org.example;

public class ArrListLen {
    public int solution(int[] A) {
        int current = 0;
        int length = 0;
        while(current != -1){
            current = A[current];
            length++;
            break;
        }
        return length;
    }
}
