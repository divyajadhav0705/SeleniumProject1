package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6Assert {
	 @Test(dependsOnMethods = "m2")
     public void m1()
     {
   	  Reporter.log("Hiii....1",true);
     }
  
    @Test
    public void m2() {
   	 Reporter.log("Hiii....2",true);
   	 Assert.fail();
   	 Reporter.log("Hello.......");
    }
    
    
    @Test
    public void m3() {
   	 Reporter.log("Hiii....3",true);
    }
    
    /* @Test(dependsOnMethods = "m5")
    public void m4() {
   	 Reporter.log("Hiii....4",true);
    }  
  */

}
