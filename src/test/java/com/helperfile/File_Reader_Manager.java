package com.helperfile;

public class File_Reader_Manager {
	
	private File_Reader_Manager(){
		
	}
	
	public static File_Reader_Manager getInstance()
	{
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;	
	}
	
	public Data_ReaderFile getInstanceData()
	{
		Data_ReaderFile reader = new Data_ReaderFile();
		return reader;
		
	}

}
