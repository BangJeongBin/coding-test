package leetcode;

import java.io.IOException;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase

        // "Person" table:
        //+----+---------+
        //| id | email   |
        //+----+---------+
        //| 1  | a@b.com |
        //| 2  | c@d.com |
        //| 3  | a@b.com |
        //+----+---------+

        //--------------------------------------------------------------------------------------------------------------

        //SELECT email As Email
        //FROM Person
        //GROUP BY email
        //HAVING COUNT(email) >= 2;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

