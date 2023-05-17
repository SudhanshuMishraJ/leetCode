package DSA_450.String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input for String
        System.out.println("Enter the string/sentence:");
        String string = sc.nextLine();

        //Using StringBuffer. Same result can be achieved using StringBuilder.
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string);
        stringBuffer.reverse();
        System.out.println("Reversed string using stringBuffer: \n" + stringBuffer);
        if(string.contentEquals(stringBuffer))
            System.out.println("Palindrom string using stringBuilder");
        else
            System.out.println("Not a Palindrom string");

        //using loops
        boolean palindromFlag= true;
        for(int i=0; i<string.length()/2;i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1))
                palindromFlag = false;
        }
        if(palindromFlag ==true)
            System.out.println("Palindrom string found using loop");
        else
            System.out.println("Not a Palindrom string");

        sc.close();

    }
}
