package DSA_450.Recursion;

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you integer value:");
        int n = sc.nextInt();
        int i= 0;
        while(i<n){
            System.out.print(fibonacci(i)+" ");
            i++;
        }
        sc.close();
    }

    private static int fibonacci(int n) {

        if(n ==0 || n==1)
            return  n;
        else
            return  fibonacci(n-1) + fibonacci(n-2);

    }
}