package Org.qsp.TestNGDemo;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadData1 {

@DataProvider
public String[][] getData() throws Exception {
  String st[][];
  FileInputStream fis=new FileInputStream(".\\demo1.xlsx");
  Workbook w = WorkbookFactory.create(fis);

 Sheet sh = w.getSheet("Sheet1");
  st= new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
 for (int i = 1; i <sh.getPhysicalNumberOfRows(); i++) {
	 for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
		st[i-1][j]=sh.getRow(i).getCell(j).toString();
	}
}
 return st;
}
	
}

