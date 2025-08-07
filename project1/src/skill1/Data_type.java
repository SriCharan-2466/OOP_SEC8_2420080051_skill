package skill1;


import java.util.*;
public class Data_type {
public static void main(String args[]){
byte Age;
short Currentyear;
int population;
long distance;
float pi;
double gravity;
char grade;
boolean JavaFun;

System.out.println("enter Age:");
Scanner sc= new Scanner(System.in);
Age=sc.nextByte();
System.out.println("enter Year:");
Currentyear=sc.nextShort();
System.out.println("enter Population:");
population=sc.nextInt();
System.out.println("enter Distance:");
distance=sc.nextLong();
System.out.println("enter Pi value:");
pi=sc.nextFloat();
System.out.println("enter Gravity:");
gravity=sc.nextDouble();
System.out.println("enter Grade:");
grade=sc.next().charAt(0);
System.out.println("enter JavaFun:");
JavaFun=sc.nextBoolean();

System.out.println("--Random Data--");
System.out.println("Age:"+Age);
System.out.println("Current Year:"+Currentyear);
System.out.println("Population:"+population);
System.out.println("Distance:"+distance);
System.out.println("Pi value:"+pi);
System.out.println("Gravity:"+gravity);
System.out.println("Grade:"+grade);
System.out.println("Java is fun?:"+JavaFun);
}
}
