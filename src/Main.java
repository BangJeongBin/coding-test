import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " "); // 입력받을 정수의 개수
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " "); // n개의 정수들
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " "); // 찾을려는 정수

        int n = Integer.parseInt(st1.nextToken());
        int v = Integer.parseInt(st3.nextToken());
        int k = 0; // count 값 저장 변수

        int[] a = new int[n]; // n개의 정수를 받을 배열 초기화

        int i = 0; // while 증감값
        while (st2.hasMoreTokens()) {
            a[i] = Integer.parseInt(st2.nextToken());
            i++;
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] == v) {
                k++;
            }
        }
        bw.write(String.valueOf(k));

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
