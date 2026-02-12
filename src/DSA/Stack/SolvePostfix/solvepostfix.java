package DSA.Stack.SolvePostfix;

public class solvepostfix {
    static int[] arr= new int[100];
    static int top=-1;

    static void push(int x){
        arr[++top]=x;
    }

    static int  pop(){
        return arr[top--];
    }


   public static void main(String[] args) {

        String postfix="57+62-*";
        for (int i = 0; i < postfix.length(); i++) {

char ch=postfix.charAt(i);
            if(Character.isDigit(ch)){
                push(ch-'0');
            }

            else{
                int op2=pop();
                int op1=pop();

                switch (ch){
                    case '+': push(op1+op2); break;
                    case '-': push(op1-op2); break;
                    case '*': push(op1*op2); break;
                    case '/': push(op1/op2); break;
                }

            }

        }
        System.out.println(arr[top]);

    }
}
