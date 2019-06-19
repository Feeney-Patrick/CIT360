package JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class writeJson {

	
	public static void main(String[] args){
		JSONObject obj = new JSONObject();
		obj.put("id", 2);
		obj.put("firstname", "John");
		obj.put("lastname", "Smith");
		obj.put("studentId", "lkjdf0943u");
		obj.put("major", "CIT");
		obj.put("year", "Junior");
		
		JSONArray list = new JSONArray();
		list.add("orange");
		list.add("yellow");
		list.add("green");
		
		
		obj.put("colors", list);
		try(FileWriter file = new FileWriter("C:\\Users\\HP\\eclipse-workspace\\CIT360\\src\\JSON\\otherJSON.json")){
			file.write(obj.toString());
			file.flush();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		System.out.println(obj);
	}
}
