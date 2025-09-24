package L11_Backtracking;

public class FindPermutations {

    public static void permutations(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr_ch=str.charAt(i);
            String newStr=str.substring(0, i) + str.substring(i+1);
            permutations(newStr, ans+curr_ch);
        }
    }

    public static void main(String[] args){
        String str="abc";
        String ans="";
        permutations(str, ans);
    }
}
