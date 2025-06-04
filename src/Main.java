import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = 0;

        while (st.hasMoreTokens()) {
            n++;
            String s = st.nextToken(); // nextToken() 메서드를 호춣하지 않으면 입력이 종료되지 않음
        }

        bw.write(String.valueOf(n));

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

