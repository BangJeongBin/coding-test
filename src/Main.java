import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine()); // "10진수로 1,000자리를 넘지 않으며 양수와 음수가 모두 주어질 수 있다." 가 문제의 조건이므로
        BigInteger b = new BigInteger(br.readLine()); // 일반적인 Long이 아닌 math 클래스를 사용한다.
        bw.write(String.valueOf(a.add(b)) + "\n");
        bw.write(String.valueOf(a.subtract(b)) + "\n");
        bw.write(String.valueOf(a.multiply(b)) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

