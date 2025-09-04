package J06_Strings;
import java.util.Scanner;
import java.util.Arrays;

public class J20Strings{

    public static int lowercaseVowels(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static boolean anagramCheck(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        char[] arr1=str1.toLowerCase().toCharArray();
        char[] arr2=str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[]args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a string: ");
        // String str=sc.nextLine();
        
        // System.out.println(lowercaseVowels(str));
        String str1="Care";
        String str2="race";
        System.out.println(anagramCheck(str1, str2));

    }
}