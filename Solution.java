package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class Solution {
    public static int solution(int[] A) {
        Deque<Integer> numDequeue = new ArrayDeque<>();
        boolean sell = true;
        int counter = 0;
        for (int a : A) {
            if (numDequeue.isEmpty()) {
                numDequeue.push(a);
            } else if (sell && a > numDequeue.getLast()) {
                numDequeue.removeLast();
                numDequeue.addLast(a);
            } else if (sell && a < numDequeue.getLast()) {
                sell = false;
                numDequeue.addLast(a);
            } else if (!sell && a < numDequeue.getLast()) {
                numDequeue.removeLast();
                numDequeue.addLast(a);
            } else if (!sell && a > numDequeue.getLast()) {
                sell = true;
                numDequeue.addLast(a);
            }
            counter++;
        }

        Iterator<Integer> it = numDequeue.iterator();
        int ind = 0;
        int profit = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (ind % 2 == 0) {
                profit += num;
            } else {
                if (it.hasNext())
                    profit -= num;
            }
            ind++;
        }

        return profit;
    }
}

//class Solution {
//    public int solution(int[] A) {
//        int n = A.length;
//        int conversions = 0;
//        Character sign = '+', prevSign = '0';
//
//        for (int i = 0; i < n; i++) {
//           if (sign.equals('+')){
//               if (A[i] == 0){
//                   return - 1;
//               }else if (A[i] < 0){
//                   conversions ++;
//               }
//                sign = '0';
//                prevSign = '+';
//           }else if (sign.equals('-')){
//               if (A[i] == 0){
//                   return - 1;
//               }else if (A[i] > 0){
//                   conversions ++;
//               }
//               sign = '0';
//               prevSign = '-';
//           }else{
//               if (A[i] != 0){
//                   conversions ++;
//               }
//               sign = prevSign.equals('+') ? '-' : '+';
//           }
//        }
//
//        return conversions;
//    }
//}


//class Solution {
//    public boolean solution(String S) {
//        int countB = 0;
//        for (char character : S.toCharArray()) {
//            if (character == 'a') {
//                if (countB > 0) {
//                    return false;
//                }
//            } else if (character == 'b') {
//                countB++;
//            }
//        }
//        return true;
//    }
//}

//class Solution {
//    public String solution(int U, int L, int[] C) {
//        int totalSum = U + L;
//        int[] upperRow = new int[C.length];
//        int[] lowerRow = new int[C.length];
//
//        int upperSum = 0;
//        int lowerSum = 0;
//
//        for (int i = 0; i < C.length; i++) {
//            if (C[i] == 2) {
//                upperRow[i] = 1;
//                lowerRow[i] = 1;
//                upperSum++;
//                lowerSum++;
//            } else if (C[i] == 1) {
//                if (upperSum < U) {
//                    upperRow[i] = 1;
//                    upperSum++;
//                } else {
//                    lowerRow[i] = 1;
//                    lowerSum++;
//                }
//            }
//        }


//// you can also use imports, for example:
//// import java.util.*;
//
//// you can write to stdout for debugging purposes, e.g.
//// System.out.println("this is a debug message");
//
//class Solution {
//    public String solution(int U, int L, int[] C) {
//        int totalSum = U + L;
//        int[] upperRow = new int[C.length];
//        int[] lowerRow = new int[C.length];
//
//        int upperSum = 0;
//        int lowerSum = 0;
//
//        for (int i = 0; i < C.length; i++) {
//            if (C[i] == 2) {
//                upperRow[i] = 1;
//                lowerRow[i] = 1;
//                upperSum++;
//                lowerSum++;
//            } else if (C[i] == 1) {
//                if (upperSum < U) {
//                    upperRow[i] = 1;
//                    upperSum++;
//                } else {
//                    lowerRow[i] = 1;
//                    lowerSum++;
//                }
//            }
//        }
//
//        if (upperSum == U && lowerSum == L) {
//            StringBuilder result = new StringBuilder();
//            for (int i = 0; i < C.length; i++) {
//                result.append(upperRow[i]);
//            }
//            result.append(",");
//            for (int i = 0; i < C.length; i++) {
//                result.append(lowerRow[i]);
//            }
//            return result.toString();
//        } else {
//            return "IMPOSSIBLE";
//        }
//    }
//}


