package leetcode;

import java.io.IOException;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 2147483645;

        //--------------------------------------------------------------------------------------------------------------

        int result = 0; // 결과 값 변수

        while (n > 0) {
             result += n % 2;
             n /= 2;
        }
        //return result;
        System.out.println("result : " + result);

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

