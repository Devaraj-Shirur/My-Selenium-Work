package screenShots;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Devaraj Shirur
 *
 */
public class ExcelLib { //ExcelUtility

	static String excelPath = "./testResources/testData.xlsx" ;
	static File Path = new File(excelPath);
	
	/**
	 * 
	 * @param sheetName provide the Sheet name where you have test data
	 * @param rowNum provide the row number where you have test data
	 * @param cellNum provide cell number where you have testdata
	 * @return   
	 */

	public static String readStringData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook =null;	
		try {
			FileInputStream fis = new FileInputStream(Path);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();	
	}
	
	public static boolean readBooleanData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream(Path);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
		
	}
	
	public static double readNumericData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream(Path);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
	}
	
	public static Date readeDate(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream(Path);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getDateCellValue();
		
	}



}
