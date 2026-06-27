package ProblemSolving2;
import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";

        char arr[] = new char[s.length()];
        int top = -1;

        boolean valid = true;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {

                top++;
                arr[top] = ch;

            }
            else {

                if(top == -1) {
                    valid = false;
                    break;
                }

                char open = arr[top];
                top--;
                if(ch == ')' && open != '(' || ch == '}' && open != '{' || ch == ']' && open != '[') {
                    valid = false;
                    break;
                }
            }
        }
        if(top != -1)
            valid = false;
        System.out.println(valid);
    }
}