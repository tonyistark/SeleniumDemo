package integration_definition;


import java.io.IOException;
import test_Runner.Runner;
import java.util.ArrayList;
import java.util.List;
import cucumber.api.junit.Cucumber;
//import integration.testrail.Integration;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.JUnit4;
import org.junit.runners.model.InitializationError;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
 
 
public class Integration {
 
public static void main(String[] args) throws IOException, APIException, XMLStreamException, FactoryConfigurationError, InitializationError {
	String path = Integration.class.getClassLoader().getResource("./").getPath();
	System.out.println("hi");
	
	path = path.replaceAll("target", "src/main/java/test_Runner");
	path = path.replaceAll("classes", "Runner.java");
	System.out.println(path);
	JUnitCore junit = new JUnitCore();
	//junit.run(Runner);
	Result result = junit.run(Runner.class);
//ExcelReportGenerator RG = new ExcelReportGenerator();
System.out.println("Executing main");
ExcelReportGenerator.main("abc");

}
 
}