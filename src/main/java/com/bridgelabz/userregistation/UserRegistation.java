package com.bridgelabz.userregistation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation  {

	// FirstName Method
	public boolean firstName(String firstName) throws UserRegistationException{
		String regex = "^[A-Z]{1}[a-zA-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		
		if (matcher.matches()) {
			return true;
		} else {
			throw new UserRegistationException(UserRegistationException.ExceptionType.INVALID_FIRST_NAME,"Invalid first name");
		}
	
		
	}

	// LastName Method

	   public boolean lastName(String lastName)throws UserRegistationException{
		   String regex="^[A-Z]{1}[a-zA-Z][a-z]{2,}$";
		   Pattern pattern=Pattern.compile(regex);
		   Matcher matcher=pattern.matcher(lastName);
		   if(matcher.matches()) {
			   return true;
		   }else {
			   throw new UserRegistationException(UserRegistationException.ExceptionType.INVALID_LAST_NAME,"Invalid Last Name");
		   }
	   }
	
	   //Email Method
	public boolean email(String email) throws UserRegistationException {
		String regex="^[a-z][a-z0-9]*@[a-z]*.[a-z]*$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		boolean valid=matcher.matches();
		if(matcher.matches()) {
			return true;
		}else {
			throw new UserRegistationException(UserRegistationException.ExceptionType.INVALID_EMAIL,"Invalid Email");
		}
		

	}
	
	//MobileNumber Method
	public boolean mobileNumber(String Mnumber) throws UserRegistationException {
		String regex="^([+][0-9])+[0-9]*$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(Mnumber);
		boolean valid=matcher.matches();
		if(valid==true) {
			return valid;
		}else {
			throw new UserRegistationException(UserRegistationException.ExceptionType.INVALID_PHONE_NUMBER,"Invalid Mnumber");
		}
		
	}
	
	//Password Method
	public boolean password(String Password) throws UserRegistationException{
		String regex="^[A-Z]{1}[a-z]*@[0-9]*$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(Password);
		boolean valid=matcher.matches();
		if(valid==true) {
			return true;
		}else {
			throw new UserRegistationException(UserRegistationException.ExceptionType.INVALID_PASSWORD,"Invalid Password");
		}
	}
		
	
}
