package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://jini-space.tistory.com/72
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] nums = {1,1,2};

        //--------------------------------------------------------------------------------------------------------------

        // 중복을 제거하기 위해 HashSet 자료형을 사용합니다.
        Set<Integer> set = new HashSet<>();

        // for문을 돌면서 nums 배열의 요소를 하나씩 set에 저장합니다.
        for(int num: nums){
            set.add(num);
        }

        // 중복 숫자가 제거된 set으로 ArrayList를 만듭니다.
        List<Integer> answerList = new ArrayList<>(set);

        // ArrayList를 정렬합니다.
        Collections.sort(answerList);

        // ArrayList의 내용을 다시 nums 배열에 넣습니다.
        for(int i=0;i<answerList.size();i++){
            nums[i]=answerList.get(i);
        }

        // 중복이 제거된 set의 사이즈를 반환합니다.
        //return set.size();

        //--------------------------------------------------------------------------------------------------------------


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

