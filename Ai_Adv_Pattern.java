public class Ai_Adv_Pattern{
    public static void main(String args[]){
        // Pattern 1 : Butterfly Pattern
        System.out.println("Butterfly Pattern:");
        int a = 4;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            int space = 2*(a-i);   
            for( int j=1 ;j<=space;j++){
                System.out.print("  "); 
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            int space = 2*(a-i);   
            for( int j=1 ;j<=space;j++){
                System.out.print("  "); 
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2 : Solid Rhombus
        int b=5;
        System.out.println("Solid Rhombus Pattern:");
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=b;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Pattern 3 : Number pyramid
        System.out.println("Number Pyramid Pattern:");
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        // Pattern 4 : Palindrome Pyramid
        System.out.println("Palindrome Pyramid Pattern:");
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
             for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }
        // Pattern 5 : Diamond Pattern
        System.out.println("Diamond Pattern:");
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=b-1;i>=1;i--){
            for(int j=1;j<=b-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
    }

}
}