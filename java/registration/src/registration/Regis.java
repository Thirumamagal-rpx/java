package registration;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Regis {

	public static final String SAMPLE_XLSX_FILE_PATH = "D://Regis.xlsx";

    public static void main(String[] args) throws IOException {

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = workbook.create(new File(SAMPLE_XLSX_FILE_PATH));

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

        /*
           =============================================================
           Iterating over all the sheets in the workbook (Multiple ways)
           =============================================================
        */

        // 1. You can obtain a sheetIterator and iterate over it
        Iterator<Sheet1> sheetIterator = workbook.sheetIterator();
        System.out.println("Retrieving Sheets using Iterator");
        while (sheetIterator.hasNext()) {
            Sheet1 sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
        }
    }
}