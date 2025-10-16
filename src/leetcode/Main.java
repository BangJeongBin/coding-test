package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {1, -10, 7, 13, 6, 8};
        int value = 5;

        //--------------------------------------------------------------------------------------------------------------

        int[] cnt = new int[value];
        for (int x : nums) {
            ++cnt[(x % value + value) % value];
        }
        for (int i = 0;; ++i) {
            if (cnt[i % value]-- == 0) {
                //return i;
            }
        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

