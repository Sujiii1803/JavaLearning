package java8.FunctionalInterface_lambda;
import java.util.function.*;
public class BuildIn_FunctionalInterfaces
{
    public static void main(String[] args)
    {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;
        Consumer<String> print = s -> System.out.println(s);

        System.out.println(isEven.test(10));
        System.out.println(square.apply(5));
        print.accept("Lambda is powerful!");
    }
}
