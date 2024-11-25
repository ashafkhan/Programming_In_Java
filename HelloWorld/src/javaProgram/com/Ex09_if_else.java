package javaProgram.com;

public class Ex09_if_else {
    public static void main(String[] args){

        int age = 0;
        if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age>=13){
            System.out.println("You are a teenager!");
        }
        else if(age>=1){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You haven't born yet!");
        }
    }
}
