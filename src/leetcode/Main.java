package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0190.Reverse%20Bits/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 43261596;

        //--------------------------------------------------------------------------------------------------------------

        int ans = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            ans |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

