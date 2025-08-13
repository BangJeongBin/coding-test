package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0300-0399/0326.Power%20of%20Three/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 27;

        //--------------------------------------------------------------------------------------------------------------

        while (n > 2) {
            if (n % 3 != 0) {
                //return false;
            }
            n /= 3;
        }
        //return n == 1;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

