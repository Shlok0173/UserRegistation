package com.bridgelabz.userregistation;

public class Junit {
      UserRegistation user=new UserRegistation();
      
      
      @Test
      
      public void MatchFirstName() {
    	  boolean result1=user.firstName("Shlok");
    	  assertEqual(result1,true);
      }
      
}
