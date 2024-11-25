package javaProgram.com;

import java.util.Scanner;
public class Ex07_Hypotenuse {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        double x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        double y = scanner.nextDouble();

        double z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is: "+z);
    }
}
