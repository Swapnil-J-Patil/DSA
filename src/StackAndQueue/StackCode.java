package StackAndQueue;

import java.util.*;

public class StackCode {
    public static void main(String[] args) {

        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque=new ArrayDeque<>(); //ArrayDeque has no capacity restriction
        //This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
      

    }
}
