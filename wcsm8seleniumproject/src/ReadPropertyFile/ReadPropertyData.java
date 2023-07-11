package ReadPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
	FileInputStream fis = new FileInputStream("./data/config1.properties");
	//create a object for peoperties file 
	        Properties prop = new Properties();
	        //make a file ready to read
	        prop.load(fis);
	        //read the property form the property file 
	        String data = prop.getProperty("Browser");
	        System.out.println(data);
		
		
		  
		  
		  
		

	}

}

