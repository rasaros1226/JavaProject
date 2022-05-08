package feb11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "D:\\Excel1.xlsx"; 
		FileInputStream o = new FileInputStream(path);
		

		Sheet excelSheet = WorkbookFactory.create(o).getSheet("hemant");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				String data= excelSheet.getRow(j).getCell(i).getStringCellValue();
		        System.out.print(data+" ");
			}
			System.out.println();
		}
	}
}
