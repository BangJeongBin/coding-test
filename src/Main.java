import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int a =  str.length();

            System.out.println(String.valueOf(str.charAt(0)) + str.charAt(a - 1)); // 아스키 코드값끼리 정수덧셈을 실행해서 강제적으로 문자열합을 유도함
            //System.out.println("" + str.charAt(0) + str.charAt(a - 1));
        }


        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}

