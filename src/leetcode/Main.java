package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0197.Rising%20Temperature/Solution.sql
public class Main {

    public static void solution() throws IOException {

        // Testcase

        //Weather table:
        //+----+------------+-------------+
        //| id | recordDate | temperature |
        //+----+------------+-------------+
        //| 1  | 2015-01-01 | 10          |
        //| 2  | 2015-01-02 | 25          |
        //| 3  | 2015-01-03 | 20          |
        //| 4  | 2015-01-04 | 30          |
        //+----+------------+-------------+

        //--------------------------------------------------------------------------------------------------------------

//        SELECT w1.id
//                FROM
//        Weather AS w1
//        JOIN Weather AS w2
//        ON DATEDIFF(w1.recordDate, w2.recordDate) = 1 AND w1.temperature > w2.temperature;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

