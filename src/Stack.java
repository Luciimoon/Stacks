import java.util.List;

public class Stack<I extends Number> {

    public static void main(String[] args) {
        java.util.Stack<String> b = new java.util.Stack<String>();

        String input = "(abc(*def)";


        char[] stringToCharArray = input.toCharArray();
        for (char output : stringToCharArray) {
            b.push(String.valueOf(output));
        }
        while(!b.isEmpty()) {
            if(b.pop().contains())

        }


    }
}
