import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();	// N 은 쓰지 않음.
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()) {

            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if(num == 1) {
                continue;
            }
            for(int i = 2; i <= Math.sqrt(num); i++) { // 제곱근을 이용한 방법
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
    // 참조 : https://st-lab.tistory.com/80


    public static void main(String[] args) throws IOException {
        solution();
    }
}

