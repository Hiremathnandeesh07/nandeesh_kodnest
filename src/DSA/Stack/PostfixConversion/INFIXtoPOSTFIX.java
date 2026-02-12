package DSA.Stack.PostfixConversion;

import java.util.Scanner;

public class INFIXtoPOSTFIX {

    static char[] stack = new char[100];
    static int top = -1;

    static void push(char c) {
        stack[++top] = c;
    }

    static char pop() {
        return stack[top--];
    }

    static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0; // for '('
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.next();

        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            // Opening parenthesis
            else if (ch == '(') {
                push(ch);
            }

            // Closing parenthesis
            else if (ch == ')') {
                while (top != -1 && stack[top] != '(') {
                    postfix.append(pop());
                }
                pop(); // remove '('
            }

            // Operator
            else {
                while (top != -1 && precedence(ch) <= precedence(stack[top])) {
                    postfix.append(pop());
                }
                push(ch);
            }
        }

        // Pop remaining operators
        while (top != -1) {
            postfix.append(pop());
        }

        System.out.println("Postfix : " + postfix);
    }
}
