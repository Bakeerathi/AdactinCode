package com.helperfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_ReaderFile {
	
	public static Properties p;
	
	public void DataReaderFile() throws IOException
	{
		
	
	File f = new File("src\\test\\java\\com\\helperfile\\Config.properties");
	FileInputStream fis = new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
	
	public String browserName()
	{
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl()
	{	
		String url = p.getProperty("url");
		return url;
		
	}
	

}
