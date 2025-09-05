package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        //--------------------------------------------------------------------------------------------------------------

        Map<Integer, Integer> d = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            // 이전에 같은 값이 있었는지 확인
            if (i - d.getOrDefault(nums[i], -1000000) <= k) {
                //return true; // 인덱스 차이가 k 이하면 바로 true
            }
            // 현재 인덱스로 업데이트
            d.put(nums[i], i);
        }
        //return false;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

