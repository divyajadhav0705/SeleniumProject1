package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnersDemo1.class)
public class DemoList  {
@Test
public void m1() {
	Reporter.log("Hi..", true);
}

@Test
public void m2() {
	Reporter.log("Hiii2..", true);
	Assert.fail();
 }
}
