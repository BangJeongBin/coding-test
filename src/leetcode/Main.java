package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 20;

        //--------------------------------------------------------------------------------------------------------------

        int result = 0, k = 0;

        for (int i = 0; i < 1000; i++) { // week count
            for (int j = i + 1; j <= 7 + i; j++) { // day count
                if (k == n) {
                    System.out.println("result ==> " + result);
                    //return result;
                }
                result += j;
                System.out.println("result -> " + result + ", j -> " + j);
                k++;
            }
        }
        //return result;

        //--------------------------------------------------------------------------------------------------------------
        // Other Solution

        int sum = 0; // result
        int count = 1;
        int c = 2;
        for (int i = 1; i <= n; i++) {
            sum += count;
            count++;
            if (i % 7 == 0) {
                count = c;
                c++;
            }
        }
        //return sum;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

