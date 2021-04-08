package seleniumBasics;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("ReadExcel.xlsx");
        Workbook wbf = WorkbookFactory.create(fis);
        Sheet s = wbf.getSheet("Sheet1");
        Row r = s.getRow(1);
        Cell c = r.getCell(0);
        System.out.println(c.getStringCellValue());

    }

}
