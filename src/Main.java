import java.io.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = new int[9];
        int answer = 0; // 가장 큰 수를 담는 변수
        int count = 0; // 가장 큰 수의 index + 1를 담는 변수

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n.length; i++) {
            if (answer < n[i]) {
                answer = n[i];
                count = i + 1;
            }

        }
        bw.write(answer + "\n");
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

