package DSA_450.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input for String
        System.out.println("Enter the length and breadth of matrix:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int[][] matrix = new int[length][breadth];
        System.out.println("Enter the elements of matrix:");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth; j++) {
                //taking value inputs here:
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        List<Integer> result = spiralMatrix(matrix);
        for (int i=0; i<length*breadth;i++) {
            System.out.print(result.get(i)+" ");
        }
    }

    private static List<Integer> spiralMatrix(int[][] matrix) {

        //getting length and breadth of matrix
        int length = matrix.length;
        int breadth = matrix[0].length;
        int size = length*breadth;
        List<Integer> results = new ArrayList<>();
        int i=0, j=0, k=0, smallerBreadth =0,smallerLength=0;
        System.out.println("total numbers of elements available:"+size);
        while(k<size){

            //toward right j++
            for(;j<breadth;j++){
                results.add(matrix[i][j]);
                k++;
            }
            i++;
            j--;
            breadth--;
            //toward bottom i++
            for(;i<length;i++){
                results.add(matrix[i][j]);
                k++;
            }
            i--;
            j--;
            length--;
            //toward left j--
            for(;j>=smallerBreadth;j--){
                results.add(matrix[i][j]);
                k++;
            }
            j++;
            i--;
            smallerBreadth++;
            //toward up i--
            for(;i>smallerLength;i--){
                results.add(matrix[i][j]);
                k++;
            }
            smallerLength++;
            i++;
            j++;
        }
        return results;
    }

}
