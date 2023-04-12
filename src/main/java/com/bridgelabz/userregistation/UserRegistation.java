package com.bridgelabz.userregistation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {

	 public void mobileNumber(String mobileNumber){
	        String regex = "^[+][0-9]{2} [6-9]{1}[0-9]{9}$";
	         Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(mobileNumber);
	        boolean valid=matcher.matches();
	        if (valid==true){
	            System.out.println("Your Mobile Number "+mobileNumber+" is Valid");
	        }
	        else{
	            System.out.println("Your First name "+mobileNumber+" is Invalid");
	        }
}
}
