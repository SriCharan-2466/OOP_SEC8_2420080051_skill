package skill2;


import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter value for a (int): ");
        int a = sc.nextInt();

        System.out.print("Enter value for b (int): ");
        int b = sc.nextInt();


        System.out.println("\n----- Arithmetic Operators -----");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


        System.out.println("\n----- Relational Operators -----");
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));


        System.out.print("\nEnter value for x (true/false): ");
        boolean x = sc.nextBoolean();

        System.out.print("Enter value for y (true/false): ");
        boolean y = sc.nextBoolean();


        System.out.println("\n----- Logical Operators -----");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));


        a += 5; // a = a + 5
        System.out.println("\nAfter a += 5, a = " + a);


        System.out.println("\n----- Unary Operators -----");
        System.out.println("a++ = " + (a++)); 
        System.out.println("++a = " + (++a)); 
    }
}