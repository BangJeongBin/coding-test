package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0171.Excel%20Sheet%20Column%20Number/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String columnTitle = "FXSHRXW";

        //--------------------------------------------------------------------------------------------------------------

        int ans = 0;
        for (int i = 0; i < columnTitle.length(); ++i) {
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

