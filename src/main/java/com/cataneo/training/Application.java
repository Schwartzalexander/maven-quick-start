package com.cataneo.training;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


public class Application {
    
	public int countWords(String text) {
		String[] separateWords = StringUtils.split(text, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
		
	}
	
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
        
        int count = app.countWords("I have four words");
        System.out.println (count);
    }
}