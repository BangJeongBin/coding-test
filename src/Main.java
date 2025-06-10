import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 횟수

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken()); // 층
            int w = Integer.parseInt(st.nextToken()); // 호실
            int n = Integer.parseInt(st.nextToken()); // n번째 손님

            HashMap<Integer, Integer> map = new HashMap<>();
            int p = 1; // key 입력용

            for (int i = 1; i <= w; i++) { // 호실
                for (int j = 1; j <= h; j++) { // 층
                    if (i < 10) {
                        map.put(p++, Integer.parseInt(j + "0" + i)); // 호실을 2자릿수로 표현하기 위한 조건식
                    } else {
                        map.put(p++, Integer.parseInt(j + "" + i));
                    }
                }
            }
            bw.write(String.valueOf(map.get(n)) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

