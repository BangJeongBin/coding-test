import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3400-3499/3423.Maximum%20Difference%20Between%20Adjacent%20Elements%20in%20a%20Circular%20Array/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] nums = {1,2,4};

        //--------------------------------------------------------------------------------------------------------------

        int n = nums.length;
        int result = Math.abs(nums[0] - nums[n - 1]);
        for (int i = 1; i < n; ++i) {
            result = Math.max(result, Math.abs(nums[i] - nums[i - 1]));
        }

        //return result;

        //--------------------------------------------------------------------------------------------------------------

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

