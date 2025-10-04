package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0000-0099/0011.Container%20With%20Most%20Water/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        //--------------------------------------------------------------------------------------------------------------

        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int t = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, t);
            if (height[l] < height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

