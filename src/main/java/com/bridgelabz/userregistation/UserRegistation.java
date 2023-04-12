package com.bridgelabz.userregistation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {

	 public boolean firstName(String testString){
	        String regex = "[A-Z]{1}[a-z]*";
	         Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(testString);
	        boolean valid=matcher.find();
	        return valid;
	      
	        }
}

