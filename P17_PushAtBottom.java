// P : Push at the Bottom of Stack.

import java.util.Stack;

public class P17_PushAtBottom{
    public static void pushAtBottom(int data, Stack<Integer> St){
        if(St.isEmpty()){
            St.push(data);
            return;
        }   
        int top = St.pop();
        pushAtBottom(data, St);
        St.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> St = new Stack<>();
        St.push(1);
        St.push(2);
        St.push(3);
        
        pushAtBottom(4, St);

        while(!St.isEmpty()){
            System.out.println(St.peek());
            St.pop();
        }
    }
}

// Time Complexity of all the operation : O(1)
// Space Complexity : O(1)