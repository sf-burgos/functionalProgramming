package com.perficient.funtionalprogramming.funtionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        //using a normal funtion Java
        System.out.println(getDBConnectionurl());
        //using a Supplier 
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlsListSupplier.get());
    }

    static String getDBConnectionurl() {
        return "jdbc://localhost:5432";
    }

    static Supplier<String> getDBConnectionUrlSupplier = ()
            -> "jdbc://localhost:5432";
    
    static Supplier<List<String>> getDBConnectionUrlsListSupplier = ()
            -> List.of(
                    "jdbc://localhost:5432",
                    "jdbc://localhost:5432List");
}
