package com.banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{	
		File src= new File("./Configuration/config.properties");
		try {
			FileInputStream ip= new FileInputStream(src);
			pro= new Properties();
			pro.load(ip);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("exception is "+ e.getMessage());
		} catch (IOException e) {
			
			System.out.println("exception is "+ e.getMessage());
		}
		
	}
	public String getApplicationurl()
	{
		String baseurl= pro.getProperty("url");
		return baseurl;
	}
	
	public String getusername()
	{
		String usrname= pro.getProperty("username");
		return usrname;
	}
	
	public String getpassword()
	{
		String pwrd= pro.getProperty("password");
		return pwrd;
		
	}

}
