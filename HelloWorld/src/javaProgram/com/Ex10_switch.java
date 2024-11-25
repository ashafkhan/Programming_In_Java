package javaProgram.com;

public class Ex10_switch {
    public static void main(String[] args){

        String day = "Saturday";

        switch(day){
            case "Sunday":
                System.out.println("It is sunday :)");
                break;
            case "Monday":
                System.out.println("it is monday!");
                break;
            case "Tuesday":
                System.out.println("It is tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                System.out.println("It is saturday!");
                break;
            default:
                System.out.println("it is not a day!");
        }
    }
}
