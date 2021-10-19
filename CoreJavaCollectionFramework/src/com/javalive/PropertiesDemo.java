package com.javalive;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author JavaLive.com
 * @description The Java Properties class, java.util.Properties, is like a Java
 *              Map of Java String key and value pairs. The Java Properties
 *              class can write the key, value pairs to a properties file on
 *              disk, and read the properties back in again. This is an often
 *              used mechanism for storing simple configuration properties for
 *              Java applications.
 *
 */
public class PropertiesDemo {
public static void main(String[] args) {
	Properties properties = new Properties();

	properties.setProperty("property1", "value1");
	properties.setProperty("property2", "value2");
	properties.setProperty("property3", "value3");
    //Write these properties to File.
	try(FileWriter output = new FileWriter("props.properties")){
	    properties.store(output, "These are properties");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	//Read these properties from File.
	try(FileReader fileReader = new FileReader("props.properties")){
	    properties.load(fileReader);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	System.out.println(properties.toString());
}
}
