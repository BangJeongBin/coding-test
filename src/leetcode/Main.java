package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/1300-1399/1317.Convert%20Integer%20to%20the%20Sum%20of%20Two%20No-Zero%20Integers/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 1010;

        //--------------------------------------------------------------------------------------------------------------

        for (int a = 1;; ++a) {
            int b = n - a;

            // 문자열로 바꿔서 "0"이 포함되어 있는지 확인
            if (!(a + "" + b).contains("0")) {
                //return new int[] {a, b};
                System.out.println(a + ", " + b);
            }
        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

