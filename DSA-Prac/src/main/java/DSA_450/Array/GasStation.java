package DSA_450.Array;

import java.util.Scanner;

public class GasStation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //taking length of array gas as input
        System.out.println("Enter length of the array gas:");
        int length = sc.nextInt();
        int[] gas = new int[length];
        int in = 0;

        //Enter elements into array gas
        System.out.println("Enter elements in array:");
        while (in < length) {
            gas[in++] = sc.nextInt();
        }
        //taking length of array cost as input
        System.out.println("Enter length of the array cost:");
        int lengthCost = sc.nextInt();
        int[] cost = new int[lengthCost];
        in = 0;

        //Enter elements into array gas
        System.out.println("Enter elements in array cost:");
        while (in < length) {
            cost[in++] = sc.nextInt();
        }
        sc.close();
        int result;
        result = canCompleteCircuit(gas, cost);
        System.out.println(result);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int length = gas.length;
        int index;
        for(int i =0; i<length;i++){
            if(cost[i]<= gas[i]){
                index = i;
                int count =0, gasLeft =0;
                while(count <length){
                    gasLeft = gas[index] - cost[index] + gasLeft;
                    if(gasLeft >-1){
                        gasLeft = gasLeft + gas[(index+1)%length];
                        index = (index+1)%length;
                        count++;
                    }else{
                        break;
                    }
                }
                if(count == length){
                    return index;
                }
            }
        }
        return -1;
    }
}