package ApachePoi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApachePoi1 {
	

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			// TODO Auto-generated method stub
	        String path = "C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files\\Test1.xlsx";
		
			InputStream file = new FileInputStream(path);
			
			String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
			
			System.out.println(data);
			
		}

	}

