package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
      @Test(invocationCount = 3,priority = 1)
      public void m1() {
    	  Reporter.log("Hiiii....", true);
      }
      
      @Test(invocationCount = 0)
      public void m2() {
    	  Reporter.log("Helloo...", true);
      }
	
      @Test(enabled = false)
      public void m3() {
    	  Reporter.log("Welcome...", true);
      }
      
      @Test(priority = 0)
      public void m4() {
    	  Reporter.log("Home.....", true);
      }

}
