package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UseCollection {
	
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", 0001);
		map.put("name", "Name0001");
		map.put("money", 100.00);
		
		
		
		//Map
		String dataA = printValue(map);
		System.out.println(dataA);
		
	}
	public static String newline = System.getProperty("line.separator");
	private static String printValue(Map<String, Object> map) {
		String printData = "";
		for (Map.Entry<String, Object> entry : map.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();

		    if("id".equals(key)){
		    	printData = printData + "Your ID :  "+value+ newline;
		    }
		    if("name".equals(key)){
		    	printData = printData + "Your Name :  "+value+ newline;
		    }
		    if("money".equals(key)){
		    	printData = printData + "Your Money :  "+value+ newline;
		    }
		}
		
		return printData;
	}
	
	
}
