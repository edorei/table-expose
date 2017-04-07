package com.edorei.expose;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.edorei.expose.api.ExposeRule;

public class Expose<T> implements ExposeRule<T>{
	
	@Override
	public void toExcel(List<T> list){
		File f=null;
		FileInputStream fis = null;
		try{
			f = new File(System.getenv("user.home")+"/new.xlsx");
			fis = new FileInputStream(f);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			workbook.cre
		}catch(Exception e){
		}
		
		
		/*File myFile = new File("C://temp/Employee.xlsx");
        FileInputStream fis = new FileInputStream(myFile);

        // Finds the workbook instance for XLSX file
        XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
       
        // Return first sheet from the XLSX workbook
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);
        
		Map<String, Object[]> data = new HashMap<String, Object[]>();
        data.put("7", new Object[] {7d, "Sonya", "75K", "SALES", "Rupert"});
        data.put("8", new Object[] {8d, "Kris", "85K", "SALES", "Rupert"});
        data.put("9", new Object[] {9d, "Dave", "90K", "SALES", "Rupert"});
     
        // Set to Iterate and add rows into XLS file
        Set<String> newRows = data.keySet();
     
        // get the last row number to append new data          
        int rownum = mySheet.getLastRowNum();         
     
        for (String key : newRows) {
         
            // Creating a new Row in existing XLSX sheet
            Row row = mySheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Boolean) {
                    cell.setCellValue((Boolean) obj);
                } else if (obj instanceof Date) {
                    cell.setCellValue((Date) obj);
                } else if (obj instanceof Double) {
                    cell.setCellValue((Double) obj);
                }
            }
        }
     
        // open an OutputStream to save written data into XLSX file
        FileOutputStream os = new FileOutputStream(myFile);
        myWorkBook.write(os);
        System.out.println("Writing on XLSX file Finished ...");*/
    }

	@Override
	public void toPdf(List<T> list) {
		
	}
}
