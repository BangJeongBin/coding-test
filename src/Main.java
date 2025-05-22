import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int point = Integer.parseInt(st.nextToken());

        if (90 <= point) {
            bw.write("A");
        } else if (80 <= point) {
            bw.write("B");
        } else if (70 <= point) {
            bw.write("C");
        } else if (60 <= point) {
            bw.write("D");
        } else {
            bw.write("F");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
