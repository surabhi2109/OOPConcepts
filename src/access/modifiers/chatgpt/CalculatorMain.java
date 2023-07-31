package access.modifiers.chatgpt;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calculate(5,4,'+'));
        System.out.println(c.calculate(5,4,'-'));
        System.out.println(c.calculate(10,2,'*'));
        System.out.println(c.calculate(10,2,'/'));
    }
}
