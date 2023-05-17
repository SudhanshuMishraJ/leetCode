package DSA_450.Array;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //taking length of array as input
        System.out.println("Enter length of the array:");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int in = 0,i=0;

        //Enter elements into array
        System.out.println("Enter elements in array:");
        while (in<length){
            arr[in++] = sc.nextInt();
        }
        sc.close();

        //swapping elements to reverse the array without any extra variable
        while (i<length/2){
            arr[i] = arr[i]+arr[length-i-1];
            arr[length-i-1] = arr[i]-arr[length-i-1];
            arr[i] = arr[i]-arr[length-i-1];
            i++;
        }

        //Display reversed array
        for (i = 0; i < length; i++) {
            System.out.println("i:"+arr[i]);
        }
    }
}
