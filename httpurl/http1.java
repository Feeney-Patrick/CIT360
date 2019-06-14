package httpurl;

import java.net.*;
import java.io.*;

public class http1 {
    public static void main(String[] args) throws Exception {
    	
    	//Creates the URL object and sets the variable to a web page.
        URL byuiURL = new URL("http://www.byui.edu/");
        
        //Creates connection object
        HttpURLConnection byuiConn= (HttpURLConnection) byuiURL.openConnection();
        
        //Creates a reader object
        BufferedReader BringIn = new BufferedReader(new InputStreamReader(
                                    byuiConn.getInputStream()));
        String input;
        //Creates loop to pull data from web page. It cannot be null or without data
        while ((input = BringIn.readLine()) != null) 
        	//Prints the data pulled from the web page
            System.out.println(input);
        //Closes the reader
        BringIn.close();
    }
}