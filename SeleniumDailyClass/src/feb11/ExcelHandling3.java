package feb11;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandling3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path ="D:\\Excel1.xlsx";
		FileInputStream object = new FileInputStream(path);
		
		Sheet excelSheet = WorkbookFactory.create(object).getSheet("hemant");
	    Cell var = excelSheet.getRow(2).getCell(2);	
	    CellType var1 = var.getCellType();
	    System.out.println(var1);
	    
	    
		}
	
}
