public class Ap_BinaryNumSystem{
    public static void main(String args[]){
        
        // Binary Number System in Java

        int num = 10; // Decimal number
        String binaryString = Integer.toBinaryString(num); // Convert to binary string
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + binaryString);

        int binaryNum = 0b1010; // Binary literal (10 in decimal)
        System.out.println("Binary Literal (0b1010): " + binaryNum);

        int hexNum = 0xA; // Hexadecimal literal (10 in decimal)
        System.out.println("Hexadecimal Literal (0xA): " + hexNum);

        int octalNum = 012; // Octal literal (10 in decimal)
        System.out.println("Octal Literal (012): " + octalNum);
    }
}