package L01_Basics;
import java.util.*;
public class J06_input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        // String name=sc.next();
        // System.out.println(name);

        // String fullName=sc.nextLine();
        // System.out.println(fullName);

        // int num=sc.nextInt();
        // System.out.println(num);

        // float price=sc.nextFloat();
        // System.out.println(price);

        System.out.print("Enter a boolean value(true/false): ");
        boolean value=sc.nextBoolean();
        System.out.println("You entered: "+ value);
    }
}