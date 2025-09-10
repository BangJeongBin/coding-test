package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0200-0299/0232.Implement%20Queue%20using%20Stacks/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {0,2,3,4,6,8,9};

        //--------------------------------------------------------------------------------------------------------------

//        private Deque<Integer> stk1 = new ArrayDeque<>();
//        private Deque<Integer> stk2 = new ArrayDeque<>();
//
//        public MyQueue() {
//        }
//
//        public void push(int x) {
//            stk1.push(x);
//        }
//
//        public int pop() {
//            move();
//            return stk2.pop();
//        }
//
//        public int peek() {
//            move();
//            return stk2.peek();
//        }
//
//        public boolean empty() {
//            return stk1.isEmpty() && stk2.isEmpty();
//        }
//
//        private void move() {
//            while (stk2.isEmpty()) {
//                while (!stk1.isEmpty()) {
//                    stk2.push(stk1.pop());
//                }
//            }
//        }

        /**
         * Your MyQueue object will be instantiated and called as such:
         * MyQueue obj = new MyQueue();
         * obj.push(x);
         * int param_2 = obj.pop();
         * int param_3 = obj.peek();
         * boolean param_4 = obj.empty();
         */

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

