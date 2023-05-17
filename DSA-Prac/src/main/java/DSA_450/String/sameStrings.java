package DSA_450.String;

import java.util.Scanner;

public class sameStrings {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input for String
        System.out.println("Enter the string/sentence 's':");
        String s = sc.nextLine();
        System.out.println("Enter the string/sentence 't':");
        String t = sc.nextLine();
        sc.close();

        boolean result = backspaceCompare(s,t);
        System.out.println(result);
    }


    public static boolean backspaceCompare(String s, String t) {
       /* example:
          1. ab#c and abd##c are same . '#' means one backspace. so, s = ac and t = ac.
          2.ab#c#d and ad are same.
          3. abc### and a are not same.*/
        int lengthS = s.length()-1;
        int lengthT = t.length()-1;
        int countT = 0, countS = 0;
        boolean flag = false;
        while(lengthS>0 && lengthT>0){
            if(s.charAt(lengthS) == '#'){
                --lengthS;
                countS++;
            }
            else if(s.charAt(lengthS) != '#' && countS>1){
                lengthS = lengthS -countS-1;
                countS =0;

            }
            else if(t.charAt(lengthT) == '#'){
                --lengthT;
                countT++;

            }else if(t.charAt(lengthT) != '#' && countT>0){
                lengthT =  lengthT- countT -1;
                countT =0;

            }
            else if(t.charAt(lengthT) == s.charAt(lengthS)){
                --lengthT;
                --lengthS;
            }
            else if(t.charAt(lengthT) != s.charAt(lengthS)){
                flag = true;
                break;
            }

        }
        if (flag == true){
            return false;
        }else{
            return true;
        }
    }
}
