public class P2_RecursionFactorial {
    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        int factorial = n*fact(n-1);
        return factorial;
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));    
    }
}
