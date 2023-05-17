package DSA_450.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingDuplicateCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input for String
        System.out.println("Enter the string/sentence:");
        String string = sc.nextLine();

        //Using HashMap
        HashMap<Character,Integer> characterHashMap = new HashMap<>();
        int length = string.length();
        int value;
        for(int i=0; i<length;i++){
            int count =0;
            if(string.isBlank()){
                System.out.println("String is empty");
            }
            else if(!characterHashMap.containsKey(string.charAt(i))){
                characterHashMap.put(string.charAt(i),++count);
            }
            else{
                value = characterHashMap.get(string.charAt(i));
                characterHashMap.put(string.charAt(i),++value);
            }
        }
        for(Map.Entry m : characterHashMap.entrySet()) {
           if((int) m.getValue() >1)
                System.out.println(m.getKey()+" "+ m.getValue());
        }
        sc.close();
    }

}
