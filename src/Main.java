import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < t; i++) { // t 만큼 반복
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken()); // 문자 반복횟수
            char[] str = st.nextToken().toCharArray(); // 입력받은 문자열 -> char 배열 화

            String answer = "";
            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < r; k++) { // r만큼 반복
                    answer += str[j];
                }
            }
            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

