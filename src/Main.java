import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num =  Integer.parseInt(br.readLine());
        int factorial = 1; // 곱셈이기 때문에 초기값이 0이 아닌 1으로 초기화 해야 함.

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        bw.write(String.valueOf(factorial));

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
