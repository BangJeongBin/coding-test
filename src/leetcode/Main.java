package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "AAAAAA";

        //--------------------------------------------------------------------------------------------------------------

        int[] cnt = new int[128]; // ascii 코드 개수
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            ++cnt[s.charAt(i)];
        }
        int ans = 0;
        for (int v : cnt) {
            ans += v / 2 * 2; // 짝수인 경우만 필터
        }
        ans += ans < n ? 1 : 0; // 결과값 홀수 만들기
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

