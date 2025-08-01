package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] prices = {3, 3};

        //--------------------------------------------------------------------------------------------------------------
        // Time Over

//        int result = 0; // 결과 값 변수
//        int minNum = 10000; // 최소값 저장 변수
//        int index = 0; // 인덱스 저장 변수
//
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = (i + 1); j < prices.length; j++) {
//                if ((prices[j] - prices[i]) > result) {
//                    result = prices[j] - prices[i];
//                }
//            }
//        }
//
//        System.out.println(result);
//
//        //return result;

        //--------------------------------------------------------------------------------------------------------------

        int ans = 0, mi = prices[0];
        for (int v : prices) {
            ans = Math.max(ans, v - mi);
            mi = Math.min(mi, v);
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

