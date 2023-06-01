package DSA_450.Recursion;

public class ParsingBooleanExpression {

    public static void main(String[] args){
        String expression = "|(f,!(f))";
         while(expression.charAt(0) != 't' || expression.charAt(0) != 'f'){
             expression = parsingSubExpression(expression);
        }
    }

    private static String parsingSubExpression(String expression) {
        String newExpression = null;
        int length = expression.length();
        int[] charArray = new int[length];
        int i = 0, k =0,flag = 0;   //1 for NOT, 2 for OR and 3 for AND
        while(i<length){
            String subExpression = expression.substring(i,i+4);
            char current = expression.charAt(i);
            //Not operator.
            if(subExpression == "!(f)") {
                charArray[k++] = 't';
            }
            else if(subExpression == "!(t)") {
                charArray[k++] = 'f';
            }
            //Not,OR and AND operator
            else {
                if(current =='!'){
                    flag = 1;
                }
                else if(current =='!'){
                    flag = 2;
                }else if(current =='&'){
                    flag = 3;
                }
                charArray[k++] = current;   //to store operator
                i++;
                charArray[k++] = current;   //to store opening parenthesis
                i++;
            }
        }
        return newExpression;
    }
}