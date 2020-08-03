package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo1 {
@Test
public void m1() {
	String aName="Ankur";
	String eName="Aman";
	Assert.assertEquals(aName, eName);
	System.out.println("matched");
}

@Test
public void m2() {
	String aName="Ankur";
	String eName="Ankur";
	Assert.assertEquals(aName, eName);
	System.out.println("matched");
}
}
