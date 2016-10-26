package integration.testrail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ExcelReportGenerator {

	public void generateExcelReport(String destFileName) throws ParserConfigurationException, SAXException, IOException	
	{		
		
		//String path = ExcelReportGenerator.class.getClassLoader().getResource("./").getPath();
		//path = path.replaceAll("target/surefire-reports/");
		String path = "C:/Users/rishi.a.garg/workspace/TestAutomation/Integration_Demo_Maven/target/surefire-reports/";
		System.out.println(path);
		File xmlFile = new File(path + "testng-results.xml");
	System.out.println(xmlFile.isFile());
	DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
	DocumentBuilder build = fact.newDocumentBuilder();
	Document doc = build.parse(xmlFile);
	doc.getDocumentElement().normalize();	
	XSSFWorkbook book =new XSSFWorkbook();
	NodeList test_list = doc.getElementsByTagName("test");	
	
for(int i = 0; i < test_list.getLength(); i++){
		int r = 0;
	Node test_node = test_list.item(i);
	String test_name = ((Element) test_node).getAttribute("name");
	XSSFSheet Sheet = book.createSheet(test_name);
	NodeList class_list = ((Element) test_node).getElementsByTagName("class");
//	System.out.println(class_list);
	for(int j = 0; j < class_list.getLength(); j++){
		Node class_node = class_list.item(j);
		String class_name = ((Element)class_node).getAttribute("name");
		NodeList test_method_list = ((Element)class_node).getElementsByTagName("test-method");
		
		System.out.println(class_name);
		/*
		for(int k = 0; k < test_method_list.getLength(); k++){
			Node test_method_node = test_method_list.item(k);

			String test_method_name = ((Element)test_method_node).getAttribute("name");
			String test_method_status = ((Element)test_method_node).getAttribute("status");
			
			XSSFRow row = Sheet.createRow(r++);
			XSSFCell cell_name = row.createCell(0);
			cell_name.setCellValue(class_name + "." + test_method_name);
			
			XSSFCell cell_status = row.createCell(1);
			cell_status.setCellValue(class_name + "." + test_method_status);
			
		}
		*/
		Node test_method_node = test_method_list.item(1);

		String test_method_name = ((Element)test_method_node).getAttribute("name");
		String test_method_status = ((Element)test_method_node).getAttribute("status");
		String newString = class_name.substring(class_name.length()-5);
		System.out.println(newString);
		XSSFRow row = Sheet.createRow(r++);
		XSSFCell cell_id = row.createCell(0);
		cell_id.setCellValue(newString);
		
		XSSFCell cell_name = row.createCell(1);
		cell_name.setCellValue(class_name);
		
		XSSFCell cell_status = row.createCell(2);
		cell_status.setCellValue( test_method_status);
		XSSFCell cell_stat = row.createCell(3);
		String stat1 = "PASS";
		 if (stat1.contentEquals(test_method_status))
		 {
		cell_stat.setCellValue( "1");
		}
		else
		cell_stat.setCellValue( "5");
		 
		 XSSFCell cell_comment = row.createCell(4);
			String comment = "PASS";
			 if (comment.contentEquals(test_method_status))
			 {
				 cell_comment.setCellValue( "Automation Run :Test is passed. URL to view results :- https://github.com/gxitrident/TestAutomation/tree/master/Integration_Demo/test-output");
			}
			else
				cell_comment.setCellValue( "Automation Run :Test failed. URL to view Results :- https://github.com/gxitrident/TestAutomation/tree/master/EELS_EndToEnd_Scripts_NewOceanProfile/test-output");
 
	}
	
}
	FileOutputStream fout = new FileOutputStream(path + destFileName);
	book.write(fout);
	fout.close();
	System.out.println("Report Generated");
	
	}

	public static void main() throws IOException, APIException {		
		try
		{
			new ExcelReportGenerator().generateExcelReport("Report.xlsx");
		} catch (ParserConfigurationException e){
			e.printStackTrace();
		} catch (SAXException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	Binding bind = new Binding();
	bind.readbind();
	
//	File srcDir = new File("C:/Users/rishi.a.garg/workspace/TestAutomation/Integration_Demo/test-output");
//	File destDir = new File("C:/Users/rishi.a.garg/workspace/TestAutomation/Integration_Demo/Backup/Backup+ " + new SimpleDateFormat("_dd-MM-yyyy_hh-mm-ss").format(new GregorianCalendar().getTime()));

//	FileUtils.copyDirectory(srcDir, destDir);
	}


}
