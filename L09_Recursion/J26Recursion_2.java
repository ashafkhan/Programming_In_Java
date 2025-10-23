package L09_Recursion;
public class J26Recursion_2 {
    
    public static int tilingProblem(int n){ // 2 * n (floor size)
        //base
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        //base
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        // //choice
        // //single
        // int fnm1 = friendsPairing(n-1);

        // //pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // int totalWays = fnm1 + pairWays;

        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }

    public static void printBinaryStrings(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        if(lastPlace == 0){
            printBinaryStrings(n-1, 0, str+"0");
            printBinaryStrings(n-1, 1, str+"1");
        }else{
            printBinaryStrings(n-1, 0, str+"0");
        }
    }
    
    public static void main(String args[]){
        // System.out.println(tilingProblem(4));
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
        // System.out.println(friendsPairing(4));
        printBinaryStrings(3, 0, "");

    }
}
