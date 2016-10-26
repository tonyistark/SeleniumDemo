package integration.testrail;

import java.util.Map;
import java.util.HashMap;
import org.json.simple.JSONObject;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class Binding {
       
    public static void main(String args) throws IOException, APIException {
   	 System.out.println("The path imported from excel is "+ args);
   	// String path = ExcelReportGenerator.class.getClassLoader().getResource("./").getPath();
   	 String path = args;
 		System.out.println("Current path is "+path);

		//path = path.replaceAll("target/classes/", "target/surefire-reports/");
		//path = "C:/Program Files (x86)/Jenkins/workspace/NewJenkinTest/NewJenkinTest/target/surefire-reports/";
 		System.out.println("Binding file looking for report in " +path);
		System.out.println(path + "Report.xlsx");
		File excel = new File(path + "Report.xlsx");  
 		
       // File excel =  new File ("C:/Users/vandana.c.singh/workspace/EELS_EndToEnd_Scripts/src/Report.xlsx");
        DataFormatter formatter = new DataFormatter();
        FileInputStream fis = new FileInputStream(excel);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet("Command line test");

        int rowNum = ws.getLastRowNum() + 1;
        int colNum = ws.getRow(0).getLastCellNum();
        String [][] data1 = new String [rowNum] [colNum];

        for(int i = 0; i <rowNum; i++){
            XSSFRow row = ws.getRow(i);
                for (int j = 0; j < colNum; j++){
                    XSSFCell cell = row.getCell(j);
                    
                    String value = formatter.formatCellValue(cell);
                    data1[i][j] = value.toString();
                  //  System.out.println ("the value is " +  data1[i][j]);
                }
        }
       wb.close();
       //  System.out.println(rowNum);           
        APIClient client = new APIClient("https://projectrident.testrail.net/");
        client.setUser("Carnival.QA.GGN.Automation@accenture.com");
        client.setPassword("Automate123");
        
        
   /*    JSONObject c = (JSONObject) client.sendGet("get_test/26606");
        JSONObject d = (JSONObject) client.sendGet("get_test/26607");
        System.out.println(c);
        System.out.println(c.get("title"));
        System.out.println(d);
        System.out.println(d.get("title"));
  */
      
        Map data = new HashMap();
        for(int k = 0; k<=rowNum-1; k++)
        {
        data.put("status_id", new Integer(data1[k][3]));
        //data.put("comment", "This test worked fine!");
        data.put("comment", data1[k][4]);
        
        String cc = "add_result/"+data1[k][0];
        System.out.println(cc);
        JSONObject r = (JSONObject) client.sendPost(cc, data);
                }
        //System.out.println(r);
        //System.out.println(r.get("status_id"));*/
        }
       
}