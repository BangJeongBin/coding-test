package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {0, 1, 0, 3, 12};

        //--------------------------------------------------------------------------------------------------------------

        int k = 0, j = 1;
        int[] arr = new int[nums.length]; // spare variable

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // non-zero case
                arr[k] = nums[i];
                k++;
            } else { // zero case
                arr[nums.length - j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        System.out.println(Arrays.toString(nums));

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

