package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/tree/main/solution/0100-0199/0181.Employees%20Earning%20More%20Than%20Their%20Managers
public class Main {

    public static void solution() throws IOException {

        // Testcase

        // "Employee" table:
        //+----+-------+--------+-----------+
        //| id | name  | salary | managerId |
        //+----+-------+--------+-----------+
        //| 1  | Joe   | 70000  | 3         |
        //| 2  | Henry | 80000  | 4         |
        //| 3  | Sam   | 60000  | Null      |
        //| 4  | Max   | 90000  | Null      |
        //+----+-------+--------+-----------+

        //--------------------------------------------------------------------------------------------------------------

        //SELECT e1.name Employee
        //FROM
        //    Employee e1
        //    JOIN Employee e2 ON e1.managerId = e2.id
        //WHERE e1.salary > e2.salary;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

