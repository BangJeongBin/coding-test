import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Calendar 객체 생성
        Calendar cal = Calendar.getInstance();

        // 날짜 포맷 지정
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        bw.write(String.valueOf(df.format(cal.getTime())));
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
