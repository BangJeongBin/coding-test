package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0200-0299/0228.Summary%20Ranges/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {0,2,3,4,6,8,9};

        //--------------------------------------------------------------------------------------------------------------

//        public List<String> summaryRanges(int[] nums) {
//            List<String> ans = new ArrayList<>();
//            for (int i = 0, j, n = nums.length; i < n; i = j + 1) {
//                j = i;
//                while (j + 1 < n && nums[j + 1] == nums[j] + 1) {
//                    ++j;
//                }
//                ans.add(f(nums, i, j));
//            }
//            return ans;
//        }
//
//        private String f(int[] nums, int i, int j) {
//            return i == j ? nums[i] + "" : String.format("%d->%d", nums[i], nums[j]);
//        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

