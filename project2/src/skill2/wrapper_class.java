package skill2;


import java.util.Scanner;

public class wrapper_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter an integer value: ");
        int a = sc.nextInt();

       
        Integer obj = Integer.valueOf(a);
        System.out.println("Boxed Integer object (using valueOf): " + obj);

       
        Integer autoBoxed = a;
        System.out.println("Auto-boxed Integer: " + autoBoxed);

       
        int b = obj.intValue();
        System.out.println("Unboxed int value (using intValue): " + b);

       
        int autoUnboxed = obj;
        System.out.println("Auto-unboxed int: " + autoUnboxed);
    }
}