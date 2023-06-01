package DSA_450.Array;

import java.util.HashMap;
import java.util.Scanner;

public class targetSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //taking length of array as input
        System.out.println("Enter length of the array:");
        int length = sc.nextInt();

        int[] arr = new int[length];
        int in = 0;

        //Enter elements into array
        System.out.println("Enter elements in array A:");
        while (in < length) {
            arr[in++] = sc.nextInt();
        }

        //taking target sum value as input
        System.out.println("Enter target sum value:");
        int target = sc.nextInt();
        sc.close();
        gettingTargetSum(arr, target);
    }

    private static void gettingTargetSum(int[] arr, int target) {

        HashMap<Integer, Integer> sumPair = new HashMap<>();

        for (int i:arr) {
            if(sumPair.containsKey(target-arr[i])){
                System.out.println(sumPair.get(arr[i]));
                return;
            }
            sumPair.put(arr[i],target-arr[i]);
        }
        System.out.println("Not found");
    }

}
