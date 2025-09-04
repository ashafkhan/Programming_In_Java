package J05_Matrix;
import java.util.Scanner;

public class J18Matrix {

    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startCol<=endCol && startRow<=endRow){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static int diag_sum(int matrix[][]){
        int sum=0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         //pd
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         //sd
        //         if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static boolean staircase_search(int matrix[][], int key){
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at: ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--; //left
            }else{
                row++; //bottom
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]){
        // int matrix[][]={{10,20,30,40},
        //                 {15,25,35,45},
        //                 {27,29,37,48},
        //                 {32,33,39,50}};
        
        // printSpiral(matrix);
        // System.out.println(diag_sum(matrix));

        // int key=100;
        // staircase_search(matrix, key);

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printSpiral(matrix);
    }
}
