package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0300-0399/0374.Guess%20Number%20Higher%20or%20Lower/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 10;
        //pick = 6

        //--------------------------------------------------------------------------------------------------------------

        /**
         * Forward declaration of guess API.
         * @param  num   your guess
         * @return 	     -1 if num is lower than the guess number
         *			      1 if num is higher than the guess number
         *               otherwise return 0
         * int guess(int num);
         */

//        int left = 1, right = n;
//        while (left < right) {
//            int mid = (left + right) >>> 1;
//            if (guess(mid) <= 0) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return left;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

