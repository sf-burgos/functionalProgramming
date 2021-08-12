
package com.perficient.funtionalprogramming.opcionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("Exception for noobs"));
        System.out.println(value); 
    }
    
}
