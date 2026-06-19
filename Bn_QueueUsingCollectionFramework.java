// Queue implementation using Stack Collection Framework.

import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.Queue;

public class Bn_QueueUsingCollectionFramework {
    public static void main(String args[]){

        // Queue <Integer> qu = new LinkedList<>();
        Queue <Integer> qu = new ArrayDeque<>();
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

// Time Complexity of all the operation : O(1)
// Space Complexity : O(1)