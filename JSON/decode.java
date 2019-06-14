package JSON;

import org.json.JSONObject;

public class decode
{
    public static void main(String str[])
    {
        String myString = "{\"student1\": { \"firstname\": \"Patrick\", \"lastname\": \"Feeney\", \"id\": \"209jF35Fdf4\", \"email\": \"pfeeney16@gmail.com\", \"major\": \"Financial Economics\"}}";
        JSONObject jsonObject = new JSONObject(myString);
        JSONObject newJSON = jsonObject.getJSONObject("student1");
        System.out.println(newJSON.toString());
        jsonObject = new JSONObject(newJSON.toString());
        System.out.println(jsonObject.getString("firstname"));
       System.out.println(jsonObject.getString("lastname"));
    }
}