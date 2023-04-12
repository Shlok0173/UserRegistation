package com.bridgelabz.userregistation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {

	 public void firstName(String firstName){
	        String regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(firstName);
	        boolean valid=matcher.matches();
	        if (valid==true){
	            System.out.println("Your First name "+firstName+" is Valid");
	        }
	        else{
	            System.out.println("Your First name "+firstName+" is Invalid");
	        }
}
}
