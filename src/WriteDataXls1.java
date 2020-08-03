import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataXls1 {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	try {
	FileInputStream fis=new FileInputStream("C:\\Users\\divya\\Desktop\\data.xlsx");
	Workbook w = WorkbookFactory.create(fis);
	Sheet sh = w.getSheet("Sheet1");
	Row row=sh.createRow(6);
	Cell cell = row.createCell(5);
	cell.setCellValue("Ankur");
	FileOutputStream fio=new FileOutputStream("C:\\Users\\divya\\Desktop\\data.xlsx");
	w.write(fio);System.out.println("Run");
	fio.close();
	fis.close();
	
}catch(Exception e)
	{
	System.out.println("File Not Found");
	e.printStackTrace();
	System.out.println(e);
	
	}
}
}
