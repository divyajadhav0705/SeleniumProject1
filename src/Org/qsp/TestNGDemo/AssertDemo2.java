package Org.qsp.TestNGDemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertDemo2 {
@Test
public void m1() {



	List<String> lst1=new ArrayList<String>();
	lst1.add("abc");
	lst1.add("Admin");
	lst1.add("xyz");
	
	
	List<String> lst2=new ArrayList<String>();
	lst2.add("abc");
	lst2.add("Admin");
	lst2.add("xyz");
	
	Assert.assertEquals(lst1, lst2);
	Reporter.log("List is matched", true);
}

@Test
public void m2() {
	List<String> lst1=new ArrayList<String>();
	lst1.add("abc");
	lst1.add("Admin");
	lst1.add("xyz");
	
	
	List<String> lst2=new ArrayList<String>();
	lst2.add("abc");
	lst2.add("Admin");
	lst2.add("xyz");
	lst2.add("pqr");
	
	Assert.assertEquals(lst1, lst2);
	Reporter.log("List is matched", true);
}

@Test
public void m3() {
	List<String> lst1=new ArrayList<String>();
	lst1.add("abc");
	lst1.add("Admin");
	lst1.add("xyz");
	
	
	List<String> lst2=new ArrayList<String>();
	lst2.add("abc");
	lst2.add("Admin");
	lst2.add("zxc");
	
	
	Assert.assertEquals(lst1, lst2);
	Reporter.log("List is matched", true);
}
}
