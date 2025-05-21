import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Long a = Long.parseLong(st.nextToken()); // int는 10의 9승까지 표현 가능, Long은 10의 18승 까지 표현 가능.
        Long b = Long.parseLong(st.nextToken()); // 백준 입력값은 10의 12승까지 입력하기 때문에 int형으로 제출 시 NumberFormatException에 걸림
        Long c = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(a + b + c));

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
