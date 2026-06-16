// P : Reverse a Stack.

import java.util.Stack;

public class P18_ReverseStack{
    public static void pushAtBottom(int data, Stack<Integer> St){
        if(St.isEmpty()){
            St.push(data);
            return;
        }   
        int top = St.pop();
        pushAtBottom(data, St);
        St.push(top);
    }

    public static void reverse(Stack<Integer> St){
        if(St.isEmpty()){
            return;
        }   
        int top = St.pop();
        reverse(St);
        pushAtBottom(top, St);
    }
    public static void main(String args[]){
        Stack<Integer> St = new Stack<>();
        St.push(1);
        St.push(2);
        St.push(3);
        
        reverse(St);

        while(!St.isEmpty()){
            System.out.println(St.peek());
            St.pop();
        }
    }
}

// Time Complexity of all the operation : O(1)
// Space Complexity : O(1)