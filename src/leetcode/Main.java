package leetcode;

import java.io.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] nums = {3,2,4};
        int target = 6;

        //--------------------------------------------------------------------------------------------------------------

        int[] result = new int[2];
        int numsLength = nums.length;

        for (int i = 0; i < numsLength; i++) {
            for (int j = i + 1; j < numsLength; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;

                    //return result;
                }
            }
        }
        //return result;

        //--------------------------------------------------------------------------------------------------------------

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

