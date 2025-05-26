import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] studentNo = new int[31]; // 출력 시 index의 값을 쓰는 것이 아닌 index 번호 자체를 쓰기 때문에 31까지 사용

        for (int i = 0; i < 28; i++) {
            int a = Integer.parseInt(br.readLine());
            studentNo[a] = 1;
        }

        for (int j = 1; j < studentNo.length; j++) {
            if (studentNo[j] != 1) {
                bw.write(String.valueOf(j) + "\n");
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
