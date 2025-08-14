package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/2200-2299/2264.Largest%203-Same-Digit%20Number%20in%20String/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String num = "6777133339";

        //--------------------------------------------------------------------------------------------------------------

        for (int i = 9; i >= 0; i--) {
            String s = String.valueOf(i).repeat(3);
            if (num.contains(s)) {
                //return s;
            }
        }
        //return "";

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

