package J02_Patterns;
public class J12Pattern_advanced{

    public static void hollow_rectangle(int totRows, int totCols){
        //outer_loop -> rows
        for(int i=1; i<=totRows; i++){
            //inner_loop -> columns
            for(int j=1; j<=totCols; j++){
                //cell -> (i,j) boundary condition check
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        //outer_loop -> rows
        for(int i=1; i<=n; i++){
            //inner_loop -> space + asterisk(*)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_withNumbers(int n){
        //outer_loop -> rows
        for(int i=1; i<=n; i++){
            //inner_loop -> cols
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int count=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //star -> i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space -> 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star -> i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //star -> i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space -> 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star -> i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_tilted_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_tilted_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //hollow rectangle stars
            for(int j=1; j<=n; j++){
                //boundary
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.err.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }

    public static void main(String args[]){
        // hollow_rectangle(4,5);
        // inverted_rotated_half_pyramid(4);
        // inverted_half_pyramid_withNumbers(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterfly_pattern(7);
        // solid_tilted_rhombus(5);
        // hollow_tilted_rhombus(5);
        diamond_pattern(4);
    }
}