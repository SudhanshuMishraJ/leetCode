package DSA_450.String;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input for String
        System.out.println("Enter the string/sentence you want to reverse:");
        String string = sc.nextLine();

        //Using StringBuilder. Same result can be achieved using StringBuffer.
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(string);
       stringBuilder.reverse();
       System.out.println("Reversed string using stringBuilder: \n"+stringBuilder);

       //Using loop
        int length = string.length();
        System.out.println("Reversed string using loop:");
        while(length>0){
            System.out.print(string.charAt(length-1));
            length--;
        }
        //Using Stack
        System.out.println("\n Reversed string using stack:");
        Stack<Character> stringStack = new Stack<>();
        if(string.isBlank())
            System.out.println(string);
        else{
            for(int i=0; i< string.length();i++){
                stringStack.push(string.charAt(i));
            }
            System.out.println("String in stack:"+stringStack);
            while(!stringStack.isEmpty()){
                System.out.print(stringStack.pop());
            }
        }
        sc.close();
    }
}
