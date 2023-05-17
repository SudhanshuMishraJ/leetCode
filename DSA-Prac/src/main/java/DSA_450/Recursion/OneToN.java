package DSA_450.Recursion;

import java.util.Scanner;

public class OneToN {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you integer value:");
        int n = sc.nextInt();
        recursionOneToN(n);
        System.out.println("");
        recursionNtoOne(n);
        sc.close();
    }

    private static void recursionNtoOne(int n) {

        if(n == 1) {
            System.out.print(n+"\t");
        } else {
            System.out.print(n+"\t");
            recursionNtoOne(n-1);
        }
    }

    private static void recursionOneToN(int n) {

        if(n == 1) {
            System.out.print(n+"\t");
        } else {
            recursionOneToN(n-1);
            System.out.print(n+"\t");
        }
    }
}
