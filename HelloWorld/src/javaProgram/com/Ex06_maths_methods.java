package javaProgram.com;

public class Ex06_maths_methods {

    public static void main(String[] args){

        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y);
        System.out.println(z);

        //some useful Math methods
        double m = Math.min(x,y);
        double k = Math.abs(y);
        double n = Math.round(x);
        double p = Math.ceil(x);
        double q = Math.floor(x);
    }
}
