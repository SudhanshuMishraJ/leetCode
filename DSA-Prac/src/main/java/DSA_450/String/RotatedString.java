package DSA_450.String;

import javax.annotation.processing.Generated;
import java.util.*;

public class RotatedString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input for String
        System.out.println("Enter both the string/sentence to compare:");
        String stringA = sc.nextLine();
        String stringB = sc.nextLine();
        sc.close();
        boolean result = rotationStringusingLoop(stringA, stringB);
        System.out.println("Result using loop:"+result);

        boolean resultQueue = rotationStringusingQueue(stringA, stringB);
        System.out.println("Result using queue:"+resultQueue);
    }

    private static boolean rotationStringusingLoop(String stringA, String stringB) {
        //if length isn't same then they can not be rotation of each.
        if (stringA.length() != stringB.length()) {
            return false;
        }
        //example abcd is rotation of bcda, cdab and dacbc
        //using loop.
        else {
            //find the first character index value in second string.
            int index = 0, i=0;
            for(i=0;i<stringB.length();i++){
                if(stringA.charAt(0) == stringB.charAt(i))
                    index = i;
            }
            //comparing character of both strings.
            for(i=0;i<stringB.length();i++){
                if(stringA.charAt(i) != stringB.charAt(index++%stringB.length()))
                    return false;
            }
            return true;
        }
    }
    //Using Circular queue
    private static boolean rotationStringusingQueue(String stringA, String stringB) {
        //if length isn't same then they can not be rotation of each.
        if (stringA.length() != stringB.length()) {
            return false;
        }
        //example abcd is rotation of bcda, cdab and dacbc
        //using queue.
        //pushing both the string charcters into the queue.
        else {
            Queue<Character> stringAQueue = new LinkedList<Character>();
            Queue<Character> stringBQueue = new LinkedList<Character>();
            for (char c : stringA.toCharArray()) {
                stringAQueue.offer(c);
            }
            for (char ch : stringB.toCharArray()) {
                stringBQueue.offer(ch);
            }

            if(stringAQueue.equals(stringBQueue)){
                return true;
            }
            else{
                char pop = stringBQueue.poll();
                stringBQueue.add(pop);
            }

        }
        return false;
    }
}
