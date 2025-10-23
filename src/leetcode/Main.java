package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3400-3499/3461.Check%20If%20Digits%20Are%20Equal%20in%20String%20After%20Operations%20I/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "3902";

        //--------------------------------------------------------------------------------------------------------------

        char[] t = s.toCharArray();
        int n = t.length;
        for (int k = n - 1; k > 1; --k) {
            for (int i = 0; i < k; ++i) {
                t[i] = (char) ((t[i] - '0' + t[i + 1] - '0') % 10 + '0');
            }
        }
        //return t[0] == t[1];

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

