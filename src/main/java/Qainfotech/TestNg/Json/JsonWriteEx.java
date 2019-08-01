package Qainfotech.TestNg.Json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriteEx {

	public static void main(String[] args) throws FileNotFoundException {
		JSONObject jo = new JSONObject();//To create object in json file like{} 
		jo.put("firstName", "Aakash"); 
        jo.put("lastName", "Kumar"); 
        jo.put("age", 21); 
   
//        // for address data, first create LinkedHashMap 
        Map m = new LinkedHashMap(4); 
        m.put("streetAddress", "21 2nd Street"); 
        m.put("city", "New York"); 
        m.put("state", "NY"); 
        m.put("postalCode", 10021); 
        jo.put("address", m);
        
        JSONArray ja = new JSONArray(); 
        m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to JSONArray 
        ja.add(m); 
         
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to JSONArray 
        ja.add(m); 
        // putting phoneNumbers to JSONObject 
        jo.put("phoneNumbers", ja); 
         
        // writing JSON to file:"JSONExample.json" in cwd 
        PrintWriter pw = new PrintWriter(System.getProperty("user.dir")+"\\src\\test\\resources\\resources\\write.json"); 
        pw.write(jo.toJSONString()); 
        System.out.print("Succesfull");
          
        pw.flush(); 
        pw.close(); 
	}

}
