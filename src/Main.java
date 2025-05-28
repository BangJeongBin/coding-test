import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine(); // 첫번쨰 입력받을 단어
        int i = Integer.parseInt(br.readLine()); // 두번째 입력받는 index 번호
        char a = word.charAt(--i);

        bw.write(a);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}

