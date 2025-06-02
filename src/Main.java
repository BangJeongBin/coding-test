import java.io.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int answer = 0;

        for (int i = 0; i < n; i++) {
             //answer += Character.getNumericValue(s.charAt(i)); // char형(ascii)을 int형으로 바꿔주는 정적메서드
             answer += s.charAt(i) - '0'; // 이 방법이 범용적으로 많이 쓰임. 안정성은 위에 코드가 더 좋음
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

