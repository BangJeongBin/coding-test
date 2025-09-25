package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0300-0399/0338.Counting%20Bits/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 2;

        //--------------------------------------------------------------------------------------------------------------

        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            ans[i] = Integer.bitCount(i);
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

