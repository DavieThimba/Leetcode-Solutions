package org.example;

public class ArrListLen {
    public int solution(int[] A) {
        int current = 0; // start at the head of the list
        int length = 0; // initialize the length of the list
        while(current != -1){
            current = A[current]; // move to the next node
            length++; // increment the length
            break;
        }
        return length;
    }
}
