package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {
      @Test(dependsOnMethods = {"m2","m3"})
      public void m1()
      {
    	  Reporter.log("Hiii....1",true);
      }
   
     @Test
     public void m2() {
    	 Reporter.log("Hiii....2",true);
     }
     
     
     @Test
     public void m3() {
    	 Reporter.log("Hiii....3",true);
     }
     
}
