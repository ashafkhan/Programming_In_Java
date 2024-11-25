package javaProgram.com;

public class Ex02_Swap {
    public static void main(String[] args){
        int x= 2;
        int y= 3;
        System.out.println("X is: "+x);
        System.out.println("Y is: "+y);

        int temp=x;
        x=y;
        y=temp;
        System.out.println("X is: "+x);
        System.out.println("Y is: "+y);
    }
}
