package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3300-3399/3354.Make%20Array%20Elements%20Equal%20to%20Zero/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {1, 0, 2, 0, 3};

        //--------------------------------------------------------------------------------------------------------------

        int s = Arrays.stream(nums).sum();
        int ans = 0, l = 0;
        for (int x : nums) {
            if (x != 0) {
                l += x;
            } else if (l * 2 == s) {
                ans += 2;
            } else if (Math.abs(l * 2 - s) <= 1) {
                ++ans;
            }
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

