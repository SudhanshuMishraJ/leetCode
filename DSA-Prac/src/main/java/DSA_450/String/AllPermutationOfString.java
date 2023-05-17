package DSA_450.String;

import java.util.Scanner;

public class AllPermutationOfString {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input for String
        System.out.println("Enter the string/sentence:");
        String string = sc.nextLine();
        sc.close();
        //Using loops to find the substrings.
        if(string == null){
            System.out.println("String provided is null/empty");
        }
        else{
            String result = findAllPermutations(string, 0, string.length());
            System.out.println("These are the following possible permutations of the given string");
            System.out.print(result+"\t");

        }
    }

    private static String findAllPermutations(String string, int start, int end) {

        if(start == end-1){
            return string;
        }
        else{
            for(int i = start; i< end; i++){
                String newString = swapString(string, start+1, end);
            }
        }

        return string;
    }

    private static String swapString(String string, int i, int j) {

        return string;
    }
}
class Main
{
    // Recursive function to generate all permutations of a string
    private static void permutations(String candidate, String remaining)
    {
        if (remaining.length() == 0) {
            System.out.println(candidate);
        }

        for (int i = 0; i < remaining.length(); i++)
        {
            String newCandidate = candidate + remaining.charAt(i);

            String newRemaining = remaining.substring(0, i) +
                    remaining.substring(i + 1);

            permutations(newCandidate, newRemaining);
        }
    }

    // Find Permutations of a string in Java
    public static void main(String[] args)
    {
        String s = "bihar";
        permutations("", s);
    }
}