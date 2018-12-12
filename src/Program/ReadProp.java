package Program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pro = new Properties();
		
		FileInputStream ip = new FileInputStream("/Users/hariom/eclipse-workspace2/Program/src/Program/config.properties");
		
		pro.load(ip);
		
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("age"));

	}

}
