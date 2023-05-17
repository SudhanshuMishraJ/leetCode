package DSA_450.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Program to print the union and intersection elements of two array.
public class UnionOfArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //taking length of array as input
        System.out.println("Enter length of the array A and B:");
        int lengthA = sc.nextInt();
        int lengthB = sc.nextInt();

        int[] arrA = new int[lengthA];
        int[] arrB = new int[lengthB];
        int in = 0, i ,counter;

        //Enter elements into array
        System.out.println("Enter elements in array A:");
        while (in < lengthA) {
            arrA[in++] = sc.nextInt();
        }
        in=0;
        System.out.println("Enter elements in array B:");
        while (in < lengthB) {
            arrB[in++] = sc.nextInt();
        }
        sc.close();

        //using HashMap
        in=1;
        HashMap<Integer, Integer> union = new HashMap<Integer, Integer>();
        for(i=0; i<lengthA; i++){
            union.put(arrA[i],in++);
        }
        for(i=0; i<lengthB; i++){
            union.put(arrB[i],in++);
        }
        //getting union values:
       for(Map.Entry<Integer,Integer> entry : union.entrySet())
           System.out.print(entry.getKey()+"\t");
        System.out.println();
       //getting same key values using Collection.iterator() -JAVA 8
        union.keySet().iterator().forEachRemaining(System.out::println);
        //using Collection.stream()
        union.keySet().stream().forEach(System.out::print);
    }
}