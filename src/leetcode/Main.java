package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 50;

        //--------------------------------------------------------------------------------------------------------------

        if (n == 0) { // n이 0인 경우
            //return false;
            System.out.println("False => 0");
        }

        while (n != 1) {
            if (n % 5 == 0) { // 제시된 수 중 가장 큰 수인 5부터 검증하여 else if 문 통과
                n /= 5;
                System.out.println("5 => " + n);
            } else if (n % 3 == 0) {
                n /= 3;
                System.out.println("3 => " + n);
            } else if (n % 2 == 0) {
                n /= 2;
                System.out.println("2 => " + n);
            } else {
                //return false;
                System.out.println("False => " + n);
                break;
            }
        }
        //return true;
        System.out.println("True");

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

