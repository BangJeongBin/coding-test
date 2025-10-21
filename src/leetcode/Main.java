package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0400-0499/0401.Binary%20Watch/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int turnedOn = 1;

        //--------------------------------------------------------------------------------------------------------------

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 60; ++j) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    ans.add(String.format("%d:%02d", i, j));
                }
            }
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

