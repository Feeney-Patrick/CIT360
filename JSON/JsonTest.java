package JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class JsonTest {
 
    private static final String filePath = "C:\\Users\\HP\\eclipse-workspace\\CIT360\\src\\JSON\\testFile.json";
     
    public static void main(String[] args) {
 
        try {
            // read the json file
            FileReader reader = new FileReader(filePath);
 
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
 
            // get a String from the JSON object
            String firstName = (String) jsonObject.get("firstname");
            String lastName = (String) jsonObject.get("lastname");
            System.out.println("The student' name is " + firstName + " " + lastName + ".");
            
         // get the student's Id
            String studentId = (String) jsonObject.get("studentId");
            System.out.println("Student Id: " + studentId);
 
         // get the student's major
            String studentMajor = (String) jsonObject.get("major");
            System.out.println("Student Major: " + studentMajor);
 
            // get the array of the students favorite colors
            JSONArray color= (JSONArray) jsonObject.get("colors");
             
            System.out.print("The student's favorite colors are " + color.get(0));
            // take the elements of the json array
            for(int i=1; i<color.size(); i++){
                 System.out.print(", " + color.get(i) );
            }
            System.out.print(".");
 
            // handle a structure into the json object
//            JSONObject structure = (JSONObject) jsonObject.get("job");
//            System.out.println("Into job structure, name: " + structure.get("name"));
 
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
 
    }
 
}