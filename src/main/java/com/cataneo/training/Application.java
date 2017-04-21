package com.cataneo.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println (numbers);
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
        Application app = new Application();
    }
}