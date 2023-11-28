package StackAndQueue;

import java.util.Stack;
//232. Implement Queue using Stacks
public class QueueImplementationUsingStack {
    public static void main(String[] args) {

    }
    class MyQueue {
        Stack<Integer> first;
        Stack<Integer> second;

        public MyQueue() {
            first=new Stack<>();
            second=new Stack<>();
        }

        public void push(int x) {
            first.push(x);
        }

        public int pop() {
            while(!first.isEmpty())
                second.push(first.pop());   //this is happening for one element at a time

            int removedItem =second.pop();

            while(!second.isEmpty())
                first.push(second.pop()); //After removal of topmost item add items to first stack

            return removedItem;
        }

        public int peek() {
            while(!first.isEmpty())
                second.push(first.pop());   //this is happening for one element at a time

            int peekedItem =second.peek();

            while(!second.isEmpty())
                first.push(second.pop()); //After removal of topmost item add items to first stack

            return peekedItem;
        }

        public boolean empty() {
            return first.isEmpty() && second.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
