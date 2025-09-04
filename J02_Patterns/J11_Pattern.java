package J02_Patterns;
public class J11_Pattern{

    //star pattern
    public static void printStar(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //inverted star
    public static void invertedStar(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //half pyramid
    public static void halfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //character pattern
    public static void charPattern(int n){
        char ch='A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // printStar(4);
        // invertedStar(4);
        // halfPyramid(4);
        charPattern(4);
    }
}