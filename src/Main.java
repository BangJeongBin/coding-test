import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String str = br.readLine();
            char[] strs = str.toCharArray(); // 입력받은 문자열 char 배열 화

            int answer = 0;
            int c = 0;

            for (int i = 0; i < strs.length; i++) {
                if (strs[i] == 'O') {
                    answer += ++c;
                } else { // strs[i] == 'X'인 경우
                    c = 0;
                    answer += c;
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

