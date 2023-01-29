package com.halfacode.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        int increment= icrement(0);
        System.out.println(increment);

        int apply = incrementByOnFunction.apply(1);
        System.out.println(apply);

        int multilply= MULTPLYbY10.apply(apply);
        System.out.println(multilply);
        Function<Integer,Integer>  addBy1AndThenMultiBy10 =
                incrementByOnFunction.andThen(MULTPLYbY10);
        System.out.println(addBy1AndThenMultiBy10.apply(4));
        //BiFunction take two argument
       // System.out.println(icrementByOneAndMultiBy(4,100));
        System.out.println(icrementByOneAndMultiByfUNCTION.apply(4,100));

    }

  static   Function<Integer, Integer> incrementByOnFunction = number -> number + 1;

    static Function<Integer, Integer> MULTPLYbY10= number -> number * 10;

    Function<Integer,Integer>  addBy1AndThenMultiBy10 =
            incrementByOnFunction.andThen(MULTPLYbY10);

    static BiFunction<Integer,Integer,Integer> icrementByOneAndMultiByfUNCTION=
            (numberToIncrementByOne, numberToMultiBy) ->(numberToIncrementByOne +1) *numberToMultiBy;


    static int icrementByOneAndMultiBy(int number, int multiBlyBy){
        return (number +1)* multiBlyBy;
    }
    static int icrement(int number){
        return number +1;
    }
}
