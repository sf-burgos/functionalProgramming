package com.perficient.funtionalprogramming.funtionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Funtion {
    public static void main(String[] args) {
        //using a stactic method 
        int increment = incrementByOne(1);
        System.out.println(increment); 
        
        // Using a function Java
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
        
        // Using two functions in one step 
        int multiply = multipleby10Function.apply(increment2);
        
        //sout
        System.out.println(multiply);
        
        // OR 
        
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =  
                incrementByOneFunction.andThen(multipleby10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4)); 
        
        //BiFuntionExample takes to 2 arg and produce 1 result
        
        System.out.println(incrementByOneFunctionAndMultiply(4, 100));
        
        System.out.println(incrementByOneFunctionAndMultiplyBiFunction.apply(4, 100)); 
        
    }
    static Function<Integer, Integer> incrementByOneFunction = 
            number -> number + 1;
    
    static Function<Integer, Integer> multipleby10Function = 
            number -> number * 10;       
            
    static int incrementByOne (int number){
        return number+1;
    }
    
    static int incrementByOneFunctionAndMultiply (int number, int numToMultiplyBy){
        return (number+1) * numToMultiplyBy;
    }
    
    static BiFunction<Integer, Integer, Integer> incrementByOneFunctionAndMultiplyBiFunction =
                (numberToIncrementByOne, numberToMultiplyBy) 
                        -> (numberToIncrementByOne + 1)* numberToMultiplyBy;
    
    
    
}
