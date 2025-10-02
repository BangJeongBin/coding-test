package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3100-3199/3100.Water%20Bottles%20II/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int numBottles = 13;
        int numExchange = 6;

        //--------------------------------------------------------------------------------------------------------------

        int ans = numBottles;
        while (numBottles >= numExchange) {
            numBottles -= numExchange;
            ++numExchange;
            ++ans;
            ++numBottles;
        }
        System.out.println(ans);
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

