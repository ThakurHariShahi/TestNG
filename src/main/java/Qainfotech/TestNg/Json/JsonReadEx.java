package Qainfotech.TestNg.Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadEx {
	public static void main(String[] args) throws IOException, ParseException {

		//Reader r = new FileReader("write.json");
		Reader r = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\resources\\write.json");
		JSONParser h = new JSONParser();
		Object obj = h.parse(r);
		JSONObject jo = (JSONObject) obj;
		String firstName = (String) jo.get("firstName");
		String lastName = (String) jo.get("lastName");
		System.out.println(firstName);
		System.out.println(lastName);
		long age = (Long) jo.get("age");
		System.out.println(age);

		Map address = ((Map) jo.get("address")); // getting address

		Iterator itr1 = address.entrySet().iterator(); // iterating address Map
		while (itr1.hasNext()) {
			Map.Entry pair = (Entry) itr1.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}

		// getting phoneNumbers
		JSONArray ja = (JSONArray) jo.get("phoneNumbers");

		// iterating phoneNumbers
		Iterator itr2 = ja.iterator();

		while (itr2.hasNext()) { 
			itr1 = ((Map) itr2.next()).entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry pair = (Entry) itr1.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
		}

		/*
		 * JSONArray array = new JSONArray(); array.add(obj); JSONObject d;
		 * for(inti=0;i<array.size();i++) { System.out.println(array.get(i)); }
		 */

	}
}
