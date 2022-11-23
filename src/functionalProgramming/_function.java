package functionalProgramming;

import java.util.function.Function;
import java.util.function.BiFunction;

public class _function {
    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    
    static int increment(int number) {
        return number + 1;
    }

    //bifunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
        (numbertoIncrementByOne, numberToMultiplyBy) -> (numbertoIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMuliplyBy){
        return (number + 1) * numToMuliplyBy;
    }
}