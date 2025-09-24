package L05_Matrix;
import java.util.Scanner;

public class J17Matrix {

    public static boolean search_matrix(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at cell: ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void lrg_sml_in_matrix(int [][]matrix){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                largest=Math.max(matrix[i][j],largest);
                smallest=Math.min(matrix[i][j],smallest);
            }
        }
        System.out.println("Largest val in the matrix is: "+largest);
        System.out.println("Smallest val in the matrix is: "+smallest);
    }

    public static void count_occurrence(int matrix[][],int key){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void nthRow_sum(int matrix[][]){
        int sum=0;
        int row=1;
        for(int i=0; i<matrix.length; i++){
            sum+=matrix[row][i];
        }
        System.out.println(sum);
    }

    public static int[][] transpose(int matrix[][]){
        int rows=matrix.length;
        int cols=matrix[0].length;
        
        int transpose[][]=new int[cols][rows];
        //swap elems row wise
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }

    //print the matrix
    public static void print_matrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        // int matrix[][]=new int[4][3];

        // int n=matrix.length;
        // int m=matrix[0].length;
        //input in the matrix cells
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }

        int matrix[][]={{11,12,13},
                        {21,22,23}};

        // search_matrix(matrix,5);
        // lrg_sml_in_matrix(matrix);
        // count_occurrence(matrix, 7);
        // nthRow_sum(matrix);

        print_matrix(matrix);
        print_matrix(transpose(matrix));

    }
}
