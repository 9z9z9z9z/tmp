package model;

import java.io.*;
import java.util.Scanner;

public class FileCirculation 
{
	private static String _encoding;
	private File file;
	public static String folder = "saves/";
	
	
    public FileCirculation(String path, String _encoding) {
    	this.file = new File(folder + path);
    	this._encoding = _encoding;
    }
    
    public void saveWMachineToFile(WashingMachine machine) throws java.io.IOException{
    	boolean ret = false;
    	FileWriter fW = null;
    	try {
	    	fW = new FileWriter(this.file.getAbsolutePath());
	    	fW.append(machine.ToString());
    	}
    	finally {
    		fW.close();
    	}
    }
    
    public WashingMachine loadMachineFromFile() {
    	String temp;
    	String key;
    	String value;
    	boolean start = false;
    	try {
    		FileReader fR = new FileReader(file.getAbsolutePath());
    		char tmp = (char) fR.read();
    		BufferedReader bR = new BufferedReader(fR);
    		while ((temp = bR.readLine()) != "" && temp != null) {
    			if((temp.indexOf("Machine:")) >= 0) {
    				start = true;
    			}
    			else if (temp.length() == 0) { start = false; }
    			if (start) {
    				key = temp.substring(0, temp.indexOf(':') - 1);
    				value = temp.substring(temp.indexOf(':'), temp.length() - 1);
    				if(!(key.isEmpty()) && !(value.isEmpty())) {
    					switch(key) {
	    					case "Color":
	    						Color color = Color.valueOf(value);
	    						break;
	    					case "Temperature":
	    						int temperature = Integer.valueOf(value);
	    						break;
	    					case "Powdertype":
    					}
    					
    				}
    			}
    		}
    	}
    	
    	return new WashingMachine();
    }
}