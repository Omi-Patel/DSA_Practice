import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-(3*4)/6+2"; // 5
        int n = str.length();

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) { // current character is a number.
                val.push(ascii - 48);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(')
                op.push(ch);

            else if (ch == ')') {
                while (op.peek() != '(') {
                    int val2 = val.pop();
                    int val1 = val.pop();

                    if (op.peek() == '+')
                        val.push(val1 + val2);
                    if (op.peek() == '-')
                        val.push(val1 - val2);
                    if (op.peek() == '*')
                        val.push(val1 * val2);
                    if (op.peek() == '/')
                        val.push(val1 / val2);

                    op.pop();
                }   
                op.pop();
            }

            else { // for operator
                if (ch == '+' || ch == '-') {
                    int val2 = val.pop();
                    int val1 = val.pop();

                    if (op.peek() == '+')
                        val.push(val1 + val2);
                    if (op.peek() == '-')
                        val.push(val1 - val2);
                    if (op.peek() == '*')
                        val.push(val1 * val2);
                    if (op.peek() == '/')
                        val.push(val1 / val2);

                    op.pop();
                    // push
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int val2 = val.pop();
                        int val1 = val.pop();

                        if (op.peek() == '*')
                            val.push(val1 * val2);
                        if (op.peek() == '/')
                            val.push(val1 / val2);

                        op.pop();
                        // push
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }

        while (val.size() > 1) {
            int val2 = val.pop();
            int val1 = val.pop();

            if (op.peek() == '+')
                val.push(val1 + val2);
            if (op.peek() == '-')
                val.push(val1 - val2);
            if (op.peek() == '*')
                val.push(val1 * val2);
            if (op.peek() == '/')
                val.push(val1 / val2);

            op.pop();
        }

        System.out.println(val.peek());
    }
}
