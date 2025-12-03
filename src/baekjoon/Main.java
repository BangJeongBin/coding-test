package baekjoon;

import java.io.*;
import java.util.*;

// 참조 : https://raon-2.tistory.com/4
public class Main {

    public static void solution() throws IOException {

        // 런타임 에러
//        import sys
//        input = sys.stdin.readline
//
//        n, k = map(int, input().split())
//
//        numbers = [i for i in range(1, n + 1)]
//
//        index = k - 1
//        while len(numbers) != 0:
//            if (index - 1) >= len(numbers): # 출력할 인덱스 번호가 리스트의 길이보다 클 경우
//                index -= len(numbers) # 리스트의 길이만큼 뺌
//                if index == len(numbers): # 출력할 인덱스 번호 - 리스트의 길이가 같은 경우
//                    index -= len(numbers)
//
//            print(numbers[index])
//            del numbers[index]
//            index += k - 1

// ------------------------------------------------------------------------------------------

//        from sys import stdin
//
//        N, K = map(int,stdin.readline().split())
//        index = 0
//        array = list(range(1,N+1))
//        result = []
//
//        while len(array) != 0: # 리스트 수가 0이 아니면 반복
//            index += (K-1)
//            index = index % len(array) # index의 값이 리스트의 길이를 상회하는 경우 조절
//            result.append(array.pop(index))
//
//        # 출력 포멧
//        print("<",end="")
//        for i in range(N-1):
//            print(result[i],end=", ")
//        print(result[N-1], end = "")
//        print(">",end="")

    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

