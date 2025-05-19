import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|");
        bw.newLine(); // 줄 바꿈

        bw.write("|q p|   /}");
        bw.newLine(); // 줄 바꿈

        bw.write("( 0 )\"\"\"\\");
        bw.newLine(); // 줄 바꿈

        bw.write("|\"^\"`    |");
        bw.newLine(); // 줄 바꿈

        bw.write("||_/=\\\\__|");
        bw.newLine(); // 줄 바꿈

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
