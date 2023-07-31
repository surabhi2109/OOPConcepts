package access.modifiers.chatgpt;

//Design a Calculator class with private methods to perform basic arithmetic operations like addition, subtraction, multiplication, and division. Provide a public method calculate that takes two operands and an operator as input and returns the result of the corresponding operation.

public class Calculator {
    private int addition(int a,int b){
        return a+b;
    }

    private int subtraction(int a,int b){
        return a-b;
    }

    private int multiplication(int a,int b){
        return a*b;
    }

    private int division(int a,int b){
        return a/b;
    }

    public int calculate(int a,int b,char op){
        switch(op){
            case '+' : return addition(a,b);
            case '-' : return subtraction(a,b);
            case '*' : return multiplication(a,b);
            case '/' : return division(a,b);
            default : return 0;
        }
    }
}
