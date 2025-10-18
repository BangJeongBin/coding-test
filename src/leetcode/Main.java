package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3300-3399/3397.Maximum%20Number%20of%20Distinct%20Elements%20After%20Operations/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {1, 2, 2, 3, 3, 4};
        int k = 2;

        //--------------------------------------------------------------------------------------------------------------

        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0, pre = Integer.MIN_VALUE;
        for (int x : nums) {
            int cur = Math.min(x + k, Math.max(x - k, pre + 1));
            if (cur > pre) {
                ++ans;
                pre = cur;
            }
        }
        //return ans;
        System.out.println(ans);

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

