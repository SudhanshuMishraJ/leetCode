package DSA_450.Array;

import java.util.Arrays;
import java.util.Scanner;

public class kth_min_max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //taking length of array as input
        System.out.println("Enter length of the array:");
        int length = sc.nextInt();

        int[] arr = new int[length];
        int in = 0, i = 0;

        //Enter elements into array
        System.out.println("Enter elements in array:");
        while (in < length) {
            arr[in++] = sc.nextInt();
        }

        System.out.println("Enter value of k :");
        int k = sc.nextInt();
        sc.close();

        //sorting Array
        Arrays.sort(arr);
        //Display sorted array
        for (i = 0; i < length; i++) {
            System.out.println("i:"+arr[i]);
        }

        //kth min value in array
        System.out.println("kth min value in array :"+arr[k-1]);
        //kth max value in array
        System.out.println("kth max value in array :"+arr[length-k]);


    }
}
