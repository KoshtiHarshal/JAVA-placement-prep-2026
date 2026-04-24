// P : Print the sum of first n natural numbers using recursion.

public class P1_RecursionSUMofNUM {
    public static int sumOfNum(int n){
        if (n==1){
            return 1; 
        }
        int sum = n + sumOfNum(n - 1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        int total = sumOfNum(n);        
        System.out.println("The sum is: " + total);
    }
}

// Time Complexity : O(n)