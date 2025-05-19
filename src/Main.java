import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("         ,r'\"7");
        bw.newLine(); // 줄 바꿈

        bw.write("r`-_   ,'  ,/");
        bw.newLine(); // 줄 바꿈

        bw.write(" \\. \". L_r'");
        bw.newLine(); // 줄 바꿈

        bw.write("   `~\\/");
        bw.newLine(); // 줄 바꿈

        bw.write("      |");
        bw.newLine(); // 줄 바꿈

        bw.write("      |");
        bw.newLine(); // 줄 바꿈


        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
