package skill2;
import java.util.Scanner;

public class typeconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value (for implicit conversion): ");
        int i = sc.nextInt();
        long l = i;
        float f = l;

        System.out.println("\n--- Implicit Type Conversion ---");
        System.out.println("Int value: " + i);
        System.out.println("Long value (implicit): " + l);
        System.out.println("Float value (implicit): " + f);

        System.out.print("\nEnter a double value (for explicit conversion): ");
        double d = sc.nextDouble();
        int j = (int) d;

        System.out.println("\n--- Explicit Type Conversion ---");
        System.out.println("Double value: " + d);
        System.out.println("Int value (after casting): " + j);
    }}