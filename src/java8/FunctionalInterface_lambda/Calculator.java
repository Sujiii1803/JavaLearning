package java8.FunctionalInterface_lambda;
@FunctionalInterface
interface CalculatorInterface {
    int operate(int a,int b);
}
public class Calculator
{
    public static void main(String[] args)
    {
        CalculatorInterface add = (a,b) -> a+b;
        CalculatorInterface sub = (a,b) -> a-b;
        CalculatorInterface mul = (a,b) -> a*b;

        System.out.println(add.operate(10, 5));
        System.out.println(sub.operate(10, 5));
        System.out.println(mul.operate(10, 5));

    }
}
