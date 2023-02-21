package com.day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) {
		File myfile =new File("./properties/Config.properties");
        System.out.println(myfile.canRead());
        System.out.println(myfile.canWrite());
        System.out.println(myfile.getName());
       //System.out.println( myfile.delete());
		System.out.println(myfile.getPath());
		System.out.println(myfile.getParentFile());
		try {
       
       Properties pro = new Properties();
       pro.load(new FileInputStream(new File("./properties/Config.properties")));
       System.out.println(pro.get("url"));
       System.out.println(pro.get("browser"));
       System.out.println(pro.get("student"));
		}
       
       /*catch(FileNotFoundException e)
		{
    	   System.out.println("oops file is missing "+e.getMessage());
		}*/
       catch(IOException e)
		{
    	  // System.out.println("File operation not supported" +e.getMessage());
		}
       
       
       
       
       
	}

}
