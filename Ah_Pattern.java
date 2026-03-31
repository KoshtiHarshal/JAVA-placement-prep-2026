public class Ah_Pattern {
    public static void main(String args[]){
    //Patterns: printing patterns using loops
    // Pattern 1: Square Pattern
    //            * * * * *
    //            * * * * *
    //            * * * * *
    //            * * * * *
    System.out.println("Square Pattern:");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    // Pattern 2: Hollow Square Pattern
    //            * * * * *
    //            *       *
    //            *       *
    //            * * * * *
    System.out.println("Hollow Square Pattern:");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
            if(i==1 || i==4|| j==1 || j==5){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    // Pattern 3: Right Angled Triangle Pattern
    //            *
    //            * *
    //            * * *
    //            * * * *
    System.out.println("Right Angled Triangle Pattern:");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    // Pattern 4: Inverted Right Angled Triangle Pattern
    //            * * * *
    //            * * *
    //            * *
    //            *
    System.out.println("Inverted Right Angled Triangle Pattern:");
    for(int i=4;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("* ");          
        }
        System.out.println();
    }
    // Pattern 5: Mirrored Right Angled Triangle Pattern
    //                  *
    //                * *
    //              * * *
    //            * * * *
    System.out.println("Mirrored Right Angled Triangle Pattern:");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    // Pattern 6: Number Right Angled Triangle Pattern
    //         1
    //         1 2
    //         1 2 3
    //         1 2 3 4
    System.out.println("Number Right Angled Triangle Pattern:");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    // Pattern 7: Inverted Number Right Angled Triangle Pattern
    //         1 2 3 4
    //         1 2 3
    //         1 2
    //         1
    System.out.println("Inverted Number Right Angled Triangle Pattern:");
    for(int i=4;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    // Pattern 8: Floyd's Triangle (Incremental Number Right Angled Triangle Pattern)
    //         1
    //         2 3
    //         4 5 6
    //         7 8 9 10
    System.out.println("Floyd's Triangle:");
    int Number = 1;
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(Number+" ");
            Number++;
        }
        System.out.println();
    }
    // Pattern 9: 0-1 Triangle Pattern
    //         1
    //         0 1
    //         1 0 1
    //         0 1 0 1
    //         1 0 1 0 1
    System.out.println("0-1 Triangle Pattern:");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }












    }
}

