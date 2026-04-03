public class Ao_Operators {
    public static void main(String args[]){

        int a = 10;
        int b = 20;

        // Arithmetic Operators
        // Binary Operators
        System.out.println("Addition: " + (a + b)); // 30
        System.out.println("Subtraction: " + (a - b)); // -10
        System.out.println("Multiplication: " + (a * b)); // 200
        System.out.println("Division: " + (b / a)); // 2
        System.out.println("Modulus: " + (b % a)); // 0
        // Unary Operators
        int c = 5;
        System.out.println("Pre-increment: " + (++c)); // 6
        System.out.println("Post-increment: " + (c++)); // 6
        System.out.println("Pre-decrement: " + (--c)); // 5
        System.out.println("Post-decrement: " + (c--)); // 5


        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // false
        System.out.println("Is a less than b? " + (a < b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Assignment Operators
        int d = 10;
        d += 5; // d = d + 5
        System.out.println("After += 5: " + d); // 15
        d -= 3; // d = d - 3
        System.out.println("After -= 3: " + d); // 12
        d *= 2; // d = d * 2
        System.out.println("After *= 2: " + d); // 24
        d /= 4; // d = d / 4
        System.out.println("After /= 4: " + d); // 6
        d %= 5; // d = d % 5
        System.out.println("After %= 5: " + d); // 1

        // Bitwise Operators
        int e = 5; // 0101 in binary
        int f = 3; // 0011 in binary

        System.out.println("Bitwise AND: " + (e & f)); // 1 (0001 in binary)
        System.out.println("Bitwise OR: " + (e | f)); // 7 (0111 in binary)
        System.out.println("Bitwise XOR: " + (e ^ f)); // 6 (0110 in binary)
        System.out.println("Bitwise NOT: " + (~e)); // -6 (in binary: 1010)
        System.out.println("Left Shift: " + (e << 1)); // 10 (0101 shifted left becomes 1010)
        System.out.println("Right Shift: " + (e >> 1)); // 2 (0101 shifted right becomes 0010)
        
    }
}
