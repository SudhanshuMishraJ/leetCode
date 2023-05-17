package DSA_450.String;

import java.util.Scanner;

public class LongestpalindromicSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input for String
        System.out.println("Enter the string/sentence:");
        String string = sc.nextLine();
        sc.close();
        //Using loops to find the substrings.
        String result = findLongestpalindromSubstringUsingLoop(string);
        System.out.println("The longest substring palindrom is:" + result + "and length is:"+ result.length());
    }

    private static String findLongestpalindromSubstringUsingLoop(String string) {

        int length = string.length();
        String longestpalindromicSubstring = String.valueOf(string.charAt(0));
        //If string is null/blank. Considering it to be non-palindromic.
        if (string.isBlank())
            return null;
        else if (length == 1) {
            return string;
        } else {
            for(int i=0;i<length;i++){
                String subStringEven = findThePalindromicLengthEven(string, i, i+1);
                String subStringOdd = findThePalindromicLengthOdd(string, i, i);
                if(subStringEven != null && subStringEven.length()>longestpalindromicSubstring.length()){
                    longestpalindromicSubstring = subStringEven;
                }
                else if(subStringOdd != null && subStringOdd.length()>longestpalindromicSubstring.length()){
                    longestpalindromicSubstring = subStringOdd;
                }
            }
            return longestpalindromicSubstring;
        }
    }

    private static String findThePalindromicLengthOdd(String string, int left, int right) {
        String substring =null;
        while(left>=0 && right < string.length() && string.charAt(left) == string.charAt(right)){
            substring = string.substring(left,right+1);
            left--;
            right++;
        }
        return substring;
    }
    private static String findThePalindromicLengthEven(String string, int left, int right) {
        String substring =null;
        while(left>=0 && right < string.length() && string.charAt(left) == string.charAt(right)){
            substring = string.substring(left,right+1);
            left--;
            right++;
        }
        return substring;
    }
}
