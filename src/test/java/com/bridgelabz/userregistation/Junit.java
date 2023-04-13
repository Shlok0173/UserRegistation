package com.bridgelabz.userregistation;

import static org.junit.Assert.assertTrue;

import javax.xml.validation.Validator;

import org.junit.Assert;
import org.junit.Test;

public class Junit {

	@Test

	public void matchFirstName() {
		UserRegistation user = new UserRegistation();
		try {
			boolean result1 = user.firstName("Shlok");
			Assert.assertTrue(result1);
		} catch (UserRegistationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void InvalidFirstName() {
		UserRegistation user = new UserRegistation();
		try {
			boolean result1 = user.firstName("98989");
		} catch (UserRegistationException e) {
			Assert.assertEquals(UserRegistationException.ExceptionType.INVALID_FIRST_NAME, e.type);
		}
	}

	@Test
	public void matcherLastName() {
		UserRegistation user = new UserRegistation();
		try {
			boolean result1 = user.lastName("Mishra");
			Assert.assertEquals(true, result1);
		} catch (UserRegistationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void invalidLastName() {
		UserRegistation user = new UserRegistation();
		try {
			boolean result1 = user.lastName("mishra");
		} catch (UserRegistationException e) {
			Assert.assertEquals(UserRegistationException.ExceptionType.INVALID_LAST_NAME, e.type);
		}
	}

	@Test
	public void matcherEmail() {
		UserRegistation user = new UserRegistation();
		try {
			boolean result = user.email("shlok01@gmil.com");
			Assert.assertEquals(true, result);
		} catch (UserRegistationException e) {
			e.printStackTrace();
		}
	}

	@Test

	public void invalidEmail() {
		UserRegistation user = new UserRegistation();
		try {
			boolean result = user.email("SHLOk@gmail.com");
		} catch (UserRegistationException e) {
			Assert.assertEquals(UserRegistationException.ExceptionType.INVALID_EMAIL, e.type);

		}
	}

	@Test
	public void matcherMobileNumber() {
		UserRegistation user = new UserRegistation();
		try {
			boolean result = user.mobileNumber("+919630311021");
			Assert.assertEquals(true, result);
		} catch (UserRegistationException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void invalidMobileNumber() {
		UserRegistation user = new UserRegistation();
		try {
			boolean result = user.mobileNumber("92293030033");
		} catch (UserRegistationException e) {
			Assert.assertEquals(UserRegistationException.ExceptionType.INVALID_PHONE_NUMBER, e.type);
		}
	}

	@Test
	public void matcherPassword() {
		UserRegistation user=new UserRegistation();
		try {
		boolean result=user.password("Shlok@123");
		Assert.assertEquals(true, result);
	}catch(UserRegistationException e) {
		e.printStackTrace();
	}
}
	@Test
	public void InvalidPassword() {
		UserRegistation user=new UserRegistation();
		try {
			boolean result=user.password("SHLOKWPP1233");
		}catch(UserRegistationException e) {
			Assert.assertEquals(UserRegistationException.ExceptionType.INVALID_PASSWORD,e.type);
		}
	}
}
