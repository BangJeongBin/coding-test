package baekjoon;

import java.io.*;
import java.util.*;

// 참조 : https://www.acmicpc.net/source/82518947
public class Main {

    public static void solution() throws IOException {

//        nList = list(map(int, input().split())) # 입력 받은 수
//        maxNum = []
//        minNum = []
//
//        for i in range(1, 11) :
//            minNum.append(nList[0] * i)
//
//        for i in range(1, (nList[0] + 1)):
//            if nList[0] % i == 0 :
//                maxNum.append(i)
//
//        maxNum.reverse() # 약수 뒤짚기
//
//        for i in maxNum :
//            if nList[1] % i == 0:
//                print(i)
//                break
//
//        mul1, mul2 = 1, 1
//
//        while True :
//            if (nList[0] * mul2) == (nList[1] * mul1) :
//                print(nList[0] * mul2)
//                break
//
//            if (nList[0] * mul2) > (nList[1] * mul1) :
//                mul1 += 1
//            else :
//                mul2 += 1





        // 다른 풀이
//        def myGCD(a, b):
//            if a % b == 0:
//                return b
//
//            return myGCD(b, a % b)
//
//        a, b = map(int, input().split())
//
//        if a < b:
//            tmp = a
//            a = b
//            b = tmp
//
//        gcd = myGCD(a,b)
//
//        print(int(gcd))
//        print(int(a*b/gcd))
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

