package leetcode;

import java.io.IOException;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase

        //Customers table:
        //+----+-------+
        //| id | name  |
        //+----+-------+
        //| 1  | Joe   |
        //| 2  | Henry |
        //| 3  | Sam   |
        //| 4  | Max   |
        //+----+-------+

        //Orders table:
        //+----+------------+
        //| id | customerId |
        //+----+------------+
        //| 1  | 3          |
        //| 2  | 1          |
        //+----+------------+

        //--------------------------------------------------------------------------------------------------------------

//        SELECT name AS Customers
//        FROM Customers
//        WHERE id NOT IN(SELECT customerId FROM Orders);

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

