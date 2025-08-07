package skill1;


import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Roll Number (long): ");
        long rollNumber = sc.nextLong();

        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks (float): ");
        float marks = sc.nextFloat();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Did the student pass? (true/false): ");
        boolean isPassed = sc.nextBoolean();

       
        System.out.println("\n----------- Student Summary -----------");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("Gender      : " + gender);
        System.out.println("Passed?     : " + isPassed);
    }
}