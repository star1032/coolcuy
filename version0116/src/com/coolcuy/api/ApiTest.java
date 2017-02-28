package com.coolcuy.api;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class ApiTest {
	@Test
	public void jsonTest() throws ParseException{
		JSONObject o = new JSONObject();
		JSONParser p = new JSONParser();
		
		
		StringBuilder text = new StringBuilder();
		text.append("{\"one\" : \"1\", \"two\" : \"2\"}");
				
		o = (JSONObject) p.parse(text.toString());
		
		System.out.println(o.toString());
	}

}
