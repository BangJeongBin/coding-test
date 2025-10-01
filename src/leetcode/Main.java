package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0300-0399/0350.Intersection%20of%20Two%20Arrays%20II/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};

        //--------------------------------------------------------------------------------------------------------------

        int[] cnt = new int[1001];
        for (int x : nums1) {
            ++cnt[x];
        }
        List<Integer> ans = new ArrayList<>();
        for (int x : nums2) {
            if (cnt[x]-- > 0) {
                ans.add(x);
            }
        }
        //return ans.stream().mapToInt(Integer::intValue).toArray();

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

