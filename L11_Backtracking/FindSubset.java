package L11_Backtracking;

public class FindSubset {

    public static void printSubset(String str, String subset){
        //base case
        if(str.length()==0){
            if(subset.length()==0){
                System.out.println("null");
            }else{
                System.out.println(subset);
            }
            return;
        }
        char ch=str.charAt(0);
        //recursion + backtracking
        printSubset(str.substring(1), subset+ch); //yes
        printSubset(str.substring(1), subset); //no

    }

    public static void main(String[] args){
        String str="abc";
        String subset="";
        printSubset(str, subset);

    }
}
