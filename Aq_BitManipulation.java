import java.util.*;

public class Aq_BitManipulation {
    public static void main(String args[]){
    
        // Bit Manipulation in Java
        //Get bit
        int n = 5; // 0101 in binary
        int getpos = 2; // Position to check (0-based index)
        int get_bitMask = 1 << getpos; // Create a bitmask by left-shifting 1 to the desired position

        if((n & get_bitMask) != 0) {
            System.out.println("Bit at position " + getpos + " is 1");
        } else {
            System.out.println("Bit at position " + getpos + " is 0");
        } 


        //Set bit
        int setpos = 1; // Position to set (0-based index)
        int set_bitMask = 1 << setpos; // Create a bitmask by left-shifting 1 to the desired position
        int newnum1 = n | set_bitMask; // Use bitwise OR to set the bit
        System.out.println("After setting bit at position " + setpos + ": " + newnum1); // 7 (0111 in binary)


        //Clear bit
        int clearPos = 2; // Position to clear (0-based index)
        int clear_bitMask = ~(1 << clearPos); // Create a bitmask by left-shifting 1 and then negating it
        int clearedNum = n & clear_bitMask; // Use bitwise AND to clear the bit
        System.out.println("After clearing bit at position " + clearPos + ": " + clearedNum); // 1 (0001 in binary)

        //Update bit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new bit value (0 or 1): ");
        int val = sc.nextInt();
        int updatePos = 1; // Position to update (0-based index)
        int update_butMask = 1 << updatePos; // Create a bitmask by left-shifting 1 to the desired position

        if(val == 1){
            int newnum2 = n | update_butMask; // Use bitwise OR to set the bit
            System.out.println("After updating bit at position " + updatePos + " to 1: " + newnum2); // 7 (0111 in binary)
        }
        else{
            int update_clearBitMask = ~(1 << updatePos); // Create a bitmask by left-shifting 1 and then negating it
            int newnum3 = n & update_clearBitMask; // Use bitwise AND to clear the bit
            System.out.println("After updating bit at position " + updatePos + " to 0: " + newnum3); // 1 (0001 in binary)
        }
    }
}
