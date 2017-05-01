package com.hussein.ci346;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.sql.ResultSet;
import java.util.HashMap;
import com.google.gson.Gson;

@RestController
public class BackEnd {

	Gson gson = new Gson();
	
	@RequestMapping(value = "/api/employees", method= RequestMethod.GET)
	public String GETIndex() {
		HashMap <String, String> finalResults = new HashMap <String, String>();
				try {
					Database db = new Database();
					
					ResultSet dbResults = db.execute("SELECT * FROM employees;");
					if(dbResults != null) {
						while (dbResults.next()) {
							HashMap<String, String> items = new HashMap<String, String>();
		
							items.put("PersonID", String.valueOf(dbResults.getInt(1)));
							items.put("LastName", dbResults.getString(2));
							items.put("FirstName", dbResults.getString(3));
							items.put("Shift", dbResults.getString(4));
							items.put("Job", dbResults.getString(5));
							
							finalResults.put(String.valueOf(finalResults.size()), gson.toJson(items));
						}
					}
					
				}
				catch(Exception e) {
				
				}
				
		return gson.toJson(finalResults);
	}
	
	@RequestMapping(value = "/api/employees/{id}", method= RequestMethod.POST)
	public String POSTIndex() {
		return "Post";
	}
	@RequestMapping(value = "/api/employees", method= RequestMethod.PUT)
	public String PUTIndex() {
		return "Put";
	}
	@RequestMapping(value = "/api/employee/{id}", method= RequestMethod.DELETE, produces = "plain/text")
	public String DELETEIndex() {
		return "Delete";
	}
	
}