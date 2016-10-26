package integration.testrail;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import org.testng.TestNG;
 
public class Integration {
 
public static void main(String[] args) throws IOException, APIException {
 
// Create object of TestNG Class
TestNG runner=new TestNG();
 
// Create a list of String 
List<String> suitefiles=new ArrayList<String>();
System.out.println("Execute xml");
// Add xml file which you have to execute
String path = Integration.class.getClassLoader().getResource("./").getPath();
System.out.println(path);
path = path.replaceAll("target/classes/", "testng.xml");
System.out.println(path);
//File excel = new File(path + "Report.xlsx");
suitefiles.add(path);


System.out.println("Execute xml end");
// now set xml file for execution
runner.setTestSuites(suitefiles);
 
// finally execute the runner using run method
runner.run();

ExcelReportGenerator RG = new ExcelReportGenerator();
System.out.println("Executing main");
//RG.excelread();
}
 
}