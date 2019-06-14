
package JSON;

/*
 * In this example I create two json objects as well as decode a json object.
 */

import org.json.JSONObject;

//import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;



class JSON {

   public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   JSONObject student1 = new JSONObject();
	   JSONObject student2 = new JSONObject();
	   
	   System.out.print("First Name: ");
	   String firstname = input.nextLine();
	   System.out.print("Last Name: ");
	   String lastname = input.nextLine();
	   System.out.print("ID: ");
	   String id = input.nextLine();
	   System.out.print("Email: ");
	   String email = input.nextLine();
	   System.out.print("Major: ");
	   String major = input.nextLine();
	   
	   student1.put("First Name", firstname);
	   student1.put("Last Name", lastname);
	   student1.put("ID", id);
	   student1.put("Email", email);
	   student1.put("Major", major);
	   
	   student2.put("First Name", "Patrick");
	   student2.put("Last Name", "Feeney");
	   student2.put("ID", "2H46fds4fDg");
	   student2.put("Email", "pgee1701@gmail.com");
	   student2.put("Major", "CIT");
	   
	  
      System.out.print(student1);
      System.out.println();
      System.out.println(student2);
      
      
      String myString = "{\"student1\": { \"firstname\": \"Patrick\", \"lastname\": \"Feeney\", \"id\": \"209jF35Fdf4\", \"email\": \"pfeeney16@gmail.com\", \"major\": \"Financial Economics\"}}";
      JSONObject jsonObject = new JSONObject(myString);
      JSONObject newJSON = jsonObject.getJSONObject("student1");
      System.out.println(newJSON.toString());
      jsonObject = new JSONObject(newJSON.toString());
      System.out.println(jsonObject.getString("firstname"));
      System.out.println(jsonObject.getString("lastname"));
      JSONObject obj1 = new JSONObject(student2.toString());
      
      System.out.println(obj1.getString("Major"));
      
            
      
   }
}