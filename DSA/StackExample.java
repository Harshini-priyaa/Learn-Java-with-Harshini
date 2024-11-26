import java.util.Stack;

public class StackExample{

    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        String brackets = "(())";
        for (int i = 0; i <= brackets.length(); i++) {
            char ch - brackets.charAt(i);
            if(ch == "("){
                stack.push(ch);
            } else{

            }
            if(ch == ")"){
                stack.pop(ch);
            }
            else {
                return false;
            }
        }

        if
    }
}