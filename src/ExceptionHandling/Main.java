package ExceptionHandling;

import java.security.spec.ECField;

public  class Main {
    static void main(String[] args)  {
        int a=5;
        int b=0;
        try{
            int c=divide(a,b);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static int divide(int a,int b)  throws Exception {
        if(b==0){
            throw new ArithmeticException("please do no divide by zero");
        }
        return a/b;
    }
}

