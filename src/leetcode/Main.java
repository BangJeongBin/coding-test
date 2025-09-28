package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0900-0999/0976.Largest%20Perimeter%20Triangle/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {2, 1, 2};

        //--------------------------------------------------------------------------------------------------------------

        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; --i) {
            int c = nums[i - 1] + nums[i - 2];
            if (c > nums[i]) {
                //return c + nums[i];
            }
        }
        //return 0;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

