package org.integration.testrail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.ss.usermodel.DataFormatter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

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

	public void generateExcelReport(String destFileName) throws ParserConfigurationException, SAXException, IOException, XMLStreamException, FactoryConfigurationError	
	{		
		String test_method_status = null;

		String path = ExcelReportGenerator.class.getClassLoader().getResource("./").getPath();
		path = path.replaceAll("classes", "cucumber-result"); 
		System.out.println(path);
		File xmlFile = new File(path + "cucumber-results.xml");
		System.out.println(xmlFile);
	System.out.println(xmlFile.isFile());
	
	DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
	DocumentBuilder build = fact.newDocumentBuilder();
	Document doc = build.parse(xmlFile);
	doc.getDocumentElement().normalize();	
	XSSFWorkbook book =new XSSFWorkbook();

	NodeList testcase_list = doc.getElementsByTagName("testcase");	

	XSSFSheet Sheet = book.createSheet("landshark");
	int r = 0;

for(int i = 0; i < testcase_list.getLength(); i++){
	System.out.println("Im running for" + (i+1)+"th time");
		
		Node test_node = testcase_list.item(i);

		String test_name = ((Element) test_node).getAttribute("classname");

	String name = ((Element) test_node).getAttribute("name");

	
System.out.println("my testcase list is " +testcase_list.getLength());  
System.out.println("My test name is " +test_name);
System.out.println("My scenario name is " +name);
NodeList failure = ((Element) test_node).getElementsByTagName("failure");
int cc =0;
cc = failure.getLength();
if(cc>0)
{

	System.out.println("error message exists");
	 test_method_status = "FAIL";
	
}
else
{

String c_content = ((Element) test_node).getTextContent();
System.out.println("My comment part is "+c_content);

int t = 0;
Pattern p = Pattern.compile("passed");
Matcher m = p.matcher( c_content );
while (m.find()) {
    t++;
}
System.out.println(t);
if (t==3)
{
	 test_method_status = "PASS";
}
else {
	 test_method_status = "FAIL";
}
}
String newString = name.substring(name.length()-5);
System.out.println(newString);
XSSFRow row = Sheet.createRow(r++);
XSSFCell cell_id = row.createCell(0);
cell_id.setCellValue(newString);

XSSFCell cell_name = row.createCell(1);
cell_name.setCellValue(name);


XSSFCell cell_status = row.createCell(2);
cell_status.setCellValue( test_method_status);

XSSFCell cell_stat = row.createCell(3);
String stat1 = "PASS";
 if (stat1.equals(test_method_status))
 {
cell_stat.setCellValue( "1");
}
else
cell_stat.setCellValue( "5");
 
 XSSFCell cell_comment = row.createCell(4);
	String comment = "PASS";
	 if (comment.equals(test_method_status))
	 {
		 cell_comment.setCellValue( "Test is passed. Output file URL :- https://github.com/gxitrident/TestAutomation/tree/master/LandSharks/LandsharkTest/target/cucumber-result");
	}
	else
		cell_comment.setCellValue( "Test failed. Output URL :- https://github.com/gxitrident/TestAutomation/tree/master/LandSharks/LandsharkTest/target/cucumber-result");  
}	



	FileOutputStream fout = new FileOutputStream(path + destFileName);
	book.write(fout);
	fout.close();
	System.out.println("Report Generated");
	
	
	}

	public static void main(String string) throws IOException,  XMLStreamException, FactoryConfigurationError, APIException {		
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
	Binding.main();
	}


}
