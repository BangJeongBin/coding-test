import java.io.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        bw.write(String.valueOf(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c)));
        bw.write("\n");
        String s = a + b;
        bw.write(String.valueOf(Integer.parseInt(s) - Integer.parseInt(c)));

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

