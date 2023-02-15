package ApachePoi;


import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApachePoi {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		String path ="C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files\\Test1.xlsx";
		
		InputStream file = new FileInputStream(path);
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Velocity");
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=0; i <=rowCount; i++)
		{
			int cellcount = sheet.getRow(i).getLastCellNum();
			
			System.out.println("Row Count : " + i);
			for(int j=0; j<cellcount; j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " , ");
			}
		}
		
		System.out.println();
	
		}
	
		
	}


