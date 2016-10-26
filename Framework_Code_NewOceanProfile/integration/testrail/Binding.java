package integration.testrail;

import integration.testrail.ExcelReportGenerator;

import java.util.Map;
import java.util.HashMap;
import org.json.simple.JSONObject;

import integration.testrail.APIException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.json.simple.JSONObject;

public class Binding {
       
     public static void main() throws IOException, APIException {
    	 String path = ExcelReportGenerator.class.getClassLoader().getResource("./").getPath();
 		path = path.replaceAll("bin", "src");
 		System.out.println(path);
 		System.out.println(path + "Report.xlsx");
 		File excel = new File(path + "Report.xlsx");  
 		
        DataFormatter formatter = new DataFormatter();
        FileInputStream fis = new FileInputStream(excel);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet("Release04");

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
        client.setUser("m.maia@accenture.com");
        client.setPassword("Pr0jec!Triden!");
        
        
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