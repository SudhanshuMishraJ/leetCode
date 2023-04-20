import java.util.Scanner;

public class Pivot {

        public static void main(String[] args) {
            //take input from user

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of array:");
            int length = sc.nextInt();
            int []arr = new int[length];
            int ls = 0, rs = 0,in = 0;
            boolean found = false;
            //press -12345 to stop entering elements into array
            System.out.println("Enter elements in array:");
            while (in<length){
                arr[in++] = sc.nextInt();
            }
            System.out.println("Number of elements entered:"+length);
            if (length == 1) {
                System.out.println("pivot is:1st element");
                found = true;
            } else {
                for (int i = 1; i < length; i++) {
                    rs += arr[i];
                }
                //for 1st index:
                if (rs == 0) {
                    System.out.println("pivot is:1st element");
                    found = true;
                }
                for (int j = 1; j < length; j++) {
                    ls = ls + arr[j - 1];
                    rs = rs - arr[j];
                    if (ls == rs) {
                        System.out.println("pivot is index:" + (j + 1) + " element");
                        found = true;
                    }
                }
            }
            if(!found)
                System.out.println("No pivot element");
        }
    }
