package com.app;

import java.util.Scanner;

public class RomanToInteger {
	
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter Roman number to convert: ");
	        String romanNumeral = sc.next();

	        int result = romanToInt(romanNumeral);
	        System.out.println("Integer value of " + romanNumeral + " is: " + result);
	    }

	    public static int romanToInt(String s) {
	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            char currentChar = s.charAt(i);
	            int currValue = romanCharToInt(currentChar);

	            if (currValue < prevValue) {
	                result -= currValue;
	            } else {
	                result += currValue;
	            }

	            prevValue = currValue;
	        }

	        return result;
	    }

	    public static int romanCharToInt(char c) {
	        switch (c) {
	            case 'I':
	                return 1;
	            case 'V':
	                return 5;
	            case 'X':
	                return 10;
	            case 'L':
	                return 50;
	            case 'C':
	                return 100;
	            case 'D':
	                return 500;
	            case 'M':
	                return 1000;
	            default:
	                return 0;
	        }
	    }
}
