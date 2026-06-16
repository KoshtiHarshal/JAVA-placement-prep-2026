// Stack implementation Using Stack Collextion Framework.

import java.util.Stack;

public class Bj_StackUsingCollectionFramework {
    public static void main(String args[]){
        Stack<Integer> St = new Stack<>();
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);

        while(!St.isEmpty()){
            System.out.println(St.peek());
            St.pop();
        }
    }
}

// Time Complexity of all the operation : O(1)
// Space Complexity : O(1)