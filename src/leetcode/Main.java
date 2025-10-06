package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int num = 64;
        // 11 -> 6


        //--------------------------------------------------------------------------------------------------------------

        for (int i = 0; i < num; i++) {
            if ((i * i) == num) {
                //return true;
                System.out.println("i ==> " + i);
                System.out.println("ture");
            } else if ((i * i) > num) {
                //return false;
                System.out.println("false");
            }
        }
        //return false;

        //--------------------------------------------------------------------------------------------------------------
        // 다른 풀이

        long min = 1;
        long max = num;
        long mid = (max + min) / 2;
        while (min <= max) {
            mid = (max + min) / 2;
            if (mid * mid == num) {
                //return true;
                System.out.println("true");
            } else if (mid * mid > num) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        //return false;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

