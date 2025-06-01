import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());


            // 0 0 0 을 입력받으면 종료
            if (x == 0 && y == 0 && z == 0) break;

            if ((x * x + y * y) == z * z) {
                System.out.println("right");
            } else if (x * x == (y * y + z * z)) {
                System.out.println("right");
            } else if (y * y == (z * z + x * x)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
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

