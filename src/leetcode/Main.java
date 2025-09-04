package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {1, 2, 3, 1};

        //--------------------------------------------------------------------------------------------------------------

        Arrays.sort(nums); // 배열 정렬

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                //return true;
                System.out.println("true");
            }
        }
        //return false;
        System.out.println("false");

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

