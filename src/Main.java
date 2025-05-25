import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " "); // n, x 값을 받기 위한 입력
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " "); // n개의 배열의 값을 받기 위한 입력

        int n = Integer.parseInt(st1.nextToken()); // 배열의 length
        int x = Integer.parseInt(st1.nextToken()); // 배열에서 비교연산을 하기 위한 기준값
        int[] a = new int[n]; // st2로 입력받는 배열 초기화

        int i = 0; // while 증감값

        while (st2.hasMoreTokens()) {
            a[i] = Integer.parseInt(st2.nextToken());
            i++;
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] < x) {
                bw.write(a[j] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
