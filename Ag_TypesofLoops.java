public class Ag_TypesofLoops {
    public static void main(String args[]){
        // Types of loops: for, while, and do-while

        //For Loop
        System.out.println("For Loop:");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        //While Loop
        System.out.println("While Loop:");
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
        //Do-While Loop
        System.out.println("Do-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while(j <= 10);
    }
}
