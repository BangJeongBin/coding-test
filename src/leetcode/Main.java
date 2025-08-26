package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3000-3099/3000.Maximum%20Area%20of%20Longest%20Diagonal%20Rectangle/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[][] dimensions = {{9, 3}, {8, 6}};

        //--------------------------------------------------------------------------------------------------------------

        int ans = 0, mx = 0;
        for (var d : dimensions) {
            int l = d[0], w = d[1];
            int t = l * l + w * w;
            if (mx < t) {
                mx = t;
                ans = l * w;
            } else if (mx == t) {
                ans = Math.max(ans, l * w);
            }
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

