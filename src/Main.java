import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 참가자의 수

        int[] sizes = new int[6];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " "); // 사이즈별 신청자 수

        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int t = Integer.parseInt(st2.nextToken()); // 티셔츠 묶음 수
        int p = Integer.parseInt(st2.nextToken()); // 펜 묶음 수

        int answer1 = 0;
        for (int i = 0; i < sizes.length; i++) {
            answer1 += (int)Math.ceil((double)sizes[i] / t); // Math 클래스의 ceil 메서드를 사용하여 올림을 함
            // 반드시 ceil 메서드를 사용하는 경우 아큐먼트로 double를 보내주어야 한다.
            // 참조 : https://luanaeun.tistory.com/208

//            bw.write(i + "번째 계산 : " + answer1 + "\n");
        }

        int answer2 = n / p;
        int answer3 = n % p;

        bw.write(answer1 + "\n");
        bw.write(answer2 + " " + answer3);

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

