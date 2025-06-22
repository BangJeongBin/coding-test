package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0000-0099/0035.Search%20Insert%20Position/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] nums = {1,3,5};
        int target = 4;

        //--------------------------------------------------------------------------------------------------------------

        int result = 0;
        int numsLength = nums.length;

        while (result < numsLength) {
            int mid = (result + numsLength) >>> 1; // 안전한 중간 값 연산을 위해 비트연산을 사용
            if (nums[mid] >= target) {
                numsLength = mid;
            } else {
                result = mid + 1;
            }
        }
        bw.write(String.valueOf(result));
        //return result;

        //--------------------------------------------------------------------------------------------------------------


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

