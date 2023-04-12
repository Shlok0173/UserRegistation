package com.bridgelabz.userregistation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {

	 public void gmail(String gmail){
	        String regex = "[a-z0-9]{3,}+([_+-.][a-z0-9]+{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3})(0,1)$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(gmail);
	        boolean valid=matcher.matches();
	        if (valid==true){
	            System.out.println("Your Email "+gmail+" is Valid");
	        }
	        else{
	            System.out.println("Your Email "+gmail+" is Invalid");
	        }
}
}
