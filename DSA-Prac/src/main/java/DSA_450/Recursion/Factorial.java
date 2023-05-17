package DSA_450.Recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you integer value:");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.print("\nFactorial of value="+result);
        sc.close();
    }

    private static int factorial(int n) {

        if(n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
