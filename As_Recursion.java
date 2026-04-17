public class As_Recursion {
    public static void printNum1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNum1(n-1);

    }
    public static void printNum2(int m){
        if (m==6){
            return;
        }
        System.out.println(m);
        printNum2(m+1);

    }
    public static void main(String[] args) {
       int n = 5; 
       int m = 1;

       printNum1(n);
       printNum2(m);
    }
}
