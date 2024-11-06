package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class UtilKit {
	static FileInputStream fis;
	public static HashMap<String, String> getTestDataFromExcel(String testcaseName){
		try {
			fis=new FileInputStream("C:\\Users\\rajee\\OneDrive\\Desktop\\Selenium Projects\\AdactinHybridFramework\\src\\test\\resources\\excels\\MasterTestData.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook wb=null;
		try {
			 wb=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet ws=wb.getSheet("regression");
		
		ArrayList<Row> testCaseRows=getTestCaseRows(ws,testcaseName);
		HashMap<String,String> testdataMap=new HashMap<String, String>();
		for(int i=0;i<testCaseRows.size();i++) {
			int noOfCells=testCaseRows.get(i).getLastCellNum();
			for(int j=1;j<noOfCells;j++) {
				testdataMap.put(testCaseRows.get(0).getCell(j).getStringCellValue(), 
						testCaseRows.get(1).getCell(j).getStringCellValue());
			}
		}
		return testdataMap;
		
		
		
	}
	private static ArrayList<Row> getTestCaseRows(XSSFSheet ws, String testcaseName) {
		ArrayList<Row> allrows=new ArrayList<Row>();
		for(int i=0;i<=ws.getLastRowNum();i++) {
			if(ws.getRow(i)!=null) {
				allrows.add(ws.getRow(i));
			}
		}
		ArrayList<Row> testcaseRows=new ArrayList<Row>();
		for(int i=0;i<allrows.size();i++) {
			if(allrows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testcaseName)) {
				testcaseRows.add(allrows.get(i));
			}
		}
		
		
		
		return testcaseRows;
		// TODO Auto-generated method stub
		
	}

}
