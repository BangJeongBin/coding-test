package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0300-0399/0392.Is%20Subsequence/Solution.java˚
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "acb";
        String t = "ahbgdc";

        //--------------------------------------------------------------------------------------------------------------

        int m = s.length(), n = t.length();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                ++i;
            }
            ++j;
        }
        //return i == m;
        System.out.println(i == m);

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

