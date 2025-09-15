package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int num = 0;

        //--------------------------------------------------------------------------------------------------------------

        while (true) {
            String str = num + "";

            if (str.length() == 1) {
                //return num;
                System.out.println("num ==> " + num);
            } else {
                num = 0;
                for (char c : str.toCharArray()) {
                    num += (c - '0');
                }
            }
        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

