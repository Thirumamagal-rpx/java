package com.vogella.maven.TRreadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class App 
{
	
	public static void main( String[] args) throws IOException
    {
	
    }
	public static boolean deleteRow(String sheetName, String excelPath, int rowNo) throws IOException {

	    XSSFWorkbook workbook = null;
	    XSSFSheet sheet = null;

	    try {
	        FileInputStream file = new FileInputStream(new File("C:\\Users\\thirumamagalm\\Desktop\\Task.xlsx"));
	        workbook = new XSSFWorkbook(file);
	        sheet = workbook.getSheet(sheetName);
	        if (sheet == null) {
	            return false;
	        }
	        int lastRowNum = sheet.getLastRowNum();
	        if (rowNo >= 0 && rowNo < lastRowNum) {
	            sheet.shiftRows(rowNo + 1, lastRowNum, -1);
	        }
	        if (rowNo == lastRowNum) {
	            XSSFRow removingRow=sheet.getRow(rowNo);
	            if(removingRow != null) {
	                sheet.removeRow(removingRow);
	            }
	        }
	        file.close();
	        FileOutputStream outFile = new FileOutputStream(new File("C:\\Users\\thirumamagalm\\Desktop\\Task.xlsx"));
	        workbook.write(outFile);
	        outFile.close();


	    } catch(Exception e) {
	        throw e;
	    } finally {
	        if(workbook != null)
	            workbook.close();
	    }
	    return false;
	}
}
    