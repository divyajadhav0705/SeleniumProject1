package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
      @Test(priority =  16)
        public void m1() {
	    Reporter.log("Hiiiiii......1", true);
      }

      @Test(priority =   1)
       public void m2() {
	   Reporter.log("Hiiiiii.........2", true);
      }

      @Test(priority =  -9)
      public void m3() {
	Reporter.log("Hiiiiii.........3", true);
}

}
