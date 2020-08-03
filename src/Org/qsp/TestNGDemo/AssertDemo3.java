package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo3 {
@Test
public void m1() {
	int i=9,j=9;
	Assert.assertEquals(i, j);
}
}
