package feb11;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandle1 {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		String path = "D:\\Excel1.xlsx";
		
		FileInputStream o =new FileInputStream(path);
		
		//String data =WorkbookFactory.create(o).getSheet("hemant").getRow(0).getCell(0).getStringCellValue();
		
		Sheet sheet = WorkbookFactory.create(o).getSheet("hemant");
		
		 for(int i =0;i<3;i++) {
			 
			for(int j=0;j<3;j++) {
				
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data +" ");
			}
			
			System.out.println();
		 }
		 
	
			
	}
}
