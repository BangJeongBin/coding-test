package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int rowIndex = 33;

        //--------------------------------------------------------------------------------------------------------------

        int[][] triangle = new int[100][100]; // 실제 연산용 변수
        List<Integer> result = new ArrayList<>(); // 리턴용 변수

        for (int i = 0; i < (rowIndex + 1); i++) {
            triangle[i][0] = 1; // 초기값 지정
            triangle[i][i] = 1; // ,,
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        for (int i = 0; i < triangle.length; i++) { // rowIndex의 값 저장
            if (i == rowIndex) {
                for (int j = 0; j < (i + 1); j++) {
                    result.add(triangle[i][j]);
                }
            }
        }

        for (Integer i : result) {
            System.out.println(i);
        }

        //return result;

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

