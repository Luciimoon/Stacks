public class postfix {


    public static void main(String[] args) {

        java.util.Stack<String> b = new java.util.Stack<String>();

        String input = "2 7 + 1 2 + +";


        char[] stringToCharArray = input.toCharArray();
        for (char output : stringToCharArray) {
            b.push(String.valueOf(output));

        }
        System.out.println();
    }
}

