// P : Queue Implementation using 2 Stacks.

import java.util.Stack;

public class P19_QueueUsing2Stacks {

    static class Queue{
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        public boolean isEmpty() {
            return st1.isEmpty();
        }

        public void add(int data){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(data);

            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return st1.pop();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return st1.peek();
        }
    }
    public static void main(String args[]){
        Queue qu = new Queue();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}

// Time Complexity of add operation : O(1)
// Time Complexity of all other operation : O(n)
// Space Complexity : O(1)