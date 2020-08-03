package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@DataProvider
	public String[][] getData() {
	String st[][]=new String[3][3];
	
	st[0][0]="Divya";
	st[0][1]="divya@123";
	st[0][2]="divya@gmail.com";
	
	st[1][0]="Alia";
	st[1][1]="alia@123";
	st[0][2]="alia@gmail.com";
	
	st[2][0]="admin";
	st[2][1]="manager";
	st[0][2]="admin@gmail.com";
	
	return st;
}

@Test(dataProvider = "getData")
public void m1(String un,String pw,String email) {
	Reporter.log(un + " " + pw + " " + email, true);
}
}
