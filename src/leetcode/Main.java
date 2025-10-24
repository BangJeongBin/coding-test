package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0400-0499/0405.Convert%20a%20Number%20to%20Hexadecimal/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int num = 26;

        //--------------------------------------------------------------------------------------------------------------

        if (num == 0) {
            //return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int x = num & 15;
            if (x < 10) {
                sb.append(x);
            } else {
                sb.append((char) (x - 10 + 'a'));
            }
            num >>>= 4;
        }
        //return sb.reverse().toString();

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

