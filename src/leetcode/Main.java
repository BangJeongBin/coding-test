package leetcode;

import java.io.IOException;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase

        // "Person" table:
        //+----------+----------+-----------+
        //| personId | lastName | firstName |
        //+----------+----------+-----------+
        //| 1        | Wang     | Allen     |
        //| 2        | Alice    | Bob       |
        //+----------+----------+-----------+

        // "Address" table:
        //+-----------+----------+---------------+------------+
        //| addressId | personId | city          | state      |
        //+-----------+----------+---------------+------------+
        //| 1         | 2        | New York City | New York   |
        //| 2         | 3        | Leetcode      | California |
        //+-----------+----------+---------------+------------+


        //--------------------------------------------------------------------------------------------------------------

        // SELECT p.firstName, p.lastName, a.city, a.state
        // FROM Person p
        // LEFT OUTER JOIN Address a
        // ON p.personId = a.personId;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

