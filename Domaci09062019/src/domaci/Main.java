package domaci;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	
	

public class Main {

	public static void main(String[] args) {
		int sum=0;
		
		try {
		File src = new File("Data (DOM).xls");
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wbe = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wbe.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			HSSFRow r = sheet1.getRow(i);
			if (r != null) {
				double data0 = r.getCell(0).getNumericCellValue();
				sum+=data0;
			} else {
				System.out.println("<Empty row>");
			}
		}
		wbe.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(sum);

		
	}
	
	
	

}
