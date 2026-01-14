package java8.FunctionalInterface_lambda;
import java.util.*;
public class LambdaWithCollections
{
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Collections.sort(list,(a,b)-> b -a);
        System.out.println(list);
    }

}
