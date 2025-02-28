package com.healthCare.arogya.genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcelUtility 
{
public String getDatafromExcelfle(String sheetName,int rowNum,int cellNum) throws Throwable {
	
	FileInputStream fis1 = new FileInputStream("./testData.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();	
	wb.close();
		
		return data;
	}

}
