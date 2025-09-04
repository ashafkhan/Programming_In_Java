package J01_Basics;
import java.util.Scanner;

public class J07_sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter two numbers a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("sum of a and b is: "+ sum);
        
    }
}