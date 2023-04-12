package com.bridgelabz.userregistation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {

	 public void password(String password){
	        String regex = "[A-Z]{1}[a-z]*@[0-9]*$";
	         Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);
	        boolean valid=matcher.matches();
	        if (valid==true){
	            System.out.println("Your Password "+" " +password+" " +" is Valid");
	        }
	        else{
	            System.out.println("Your Password "+ " " +password+" "+" is Invalid");
	        }
}
}
