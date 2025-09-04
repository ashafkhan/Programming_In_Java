package J06_Strings;
public class J19Strings_basic {
    
    public static boolean ispalindrome(String s1){
        int n=s1.length();
        for(int i=0; i<n/2; i++){
            if(s1.charAt(i)!=s1.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);
            if(dir=='N') y++;
            if(dir=='S') y--;
            if(dir=='W') x--;
            if(dir=='E') x++;
        }
        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }

    public static String CapitalizeWords(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompress(String str){
        String newStr="";
        //aaabbcccdd
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }

    public static String compressString_using_sb(String str){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        char arr[]={'a','b','c','d','e'};
        
        String str1="abcde";
        String str2=new String("xyz @ # 1234");

        // ***** Strings are IMMUTABLE *****

        // String s1="racecar";
        // System.out.println(ispalindrome(s1));

        // String path="WNEENESENNN";
        // System.out.println(getShortestPath(path));

        String str3="java is fun to learn";
        // System.out.println(CapitalizeWords(str3));

        String str4="aaabbcccdd";
        // System.out.println(stringCompress(str4));
        System.out.println(compressString_using_sb(str4));
    }
}
