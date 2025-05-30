import java.io.*;
import java.util.*;

public class Main {

    public static int square(int nn) { // 파라메터를 제곱해서 리턴하는 메서드
        return nn * nn;
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = 0;

        while (st.hasMoreTokens()) {
            n += square(Integer.parseInt(st.nextToken()));
        }
        bw.write(String.valueOf(n % 10));

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

