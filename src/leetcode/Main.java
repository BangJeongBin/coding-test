package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0200-0299/0202.Happy%20Number/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 19;

        //--------------------------------------------------------------------------------------------------------------

        Set<Integer> vis = new HashSet<>();
        while (n != 1 && !vis.contains(n)) {
            vis.add(n);
            int x = 0;
            while (n != 0) {
                // 각 자리수만큼 계산
                x += (n % 10) * (n % 10);
                n /= 10;
            }
            n = x;
        }
        //return n == 1;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

