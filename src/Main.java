import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String answer = pushed45minutes(h, m); // 45분을 앞당기는 메서드 호출

        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();
    }

    public static String pushed45minutes(int h, int m) {
        m -= 45;

        if (m < 0) { // m - 45가 음수가 나올 경우
            m = 60 + m;
            if (h == 0) { // h가 24시 인 경우
                h = 23;
            } else { // 아닌경우 -1
                h--;
            }
        }
        String answer = h + " " + m;

        return answer;
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

