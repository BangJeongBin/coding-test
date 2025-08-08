package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        //--------------------------------------------------------------------------------------------------------------

        List<Integer> list = new ArrayList<>();
        int index = 0;

        for (int num : nums) { // 리스트 초기화
            list.add(num);
        }
        Collections.sort(list); // 리스트 정렬

        while (index < list.size()) {
            int qty = Collections.frequency(list, list.get(index)); // 해당 값의 개수를 추출
            if (qty > (list.size() / 2)) { // 과반수일 경우 리턴
                //return list.get(index);
                System.out.println(list.get(index));
            }
            // 아닐 경우 해당값의 마지막 인덱스를 추출하고 그 다음 값으로 중복 뛰어넘기
            index += list.lastIndexOf(list.get(index)) + 1;
        }
        //return 0;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

