import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 정수의 개수
        int maxNum = -1000000;
        int minNum = 1000000;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            int s = Integer.parseInt(st.nextToken());

            if (s > maxNum) {
                maxNum = s;
            }
            if (s < minNum) {
                minNum = s;
            }
        }

        bw.write(String.valueOf(minNum + " " + maxNum));

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

