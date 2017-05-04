package com.hussein.ci346;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.sql.ResultSet;
import java.util.HashMap;
import com.google.gson.Gson;

@RestController
public class BackEnd {

	Gson gson = new Gson();
	
	@RequestMapping(value = "/api/staff", method= RequestMethod.GET)
	public String GETIndex() {
		HashMap <String, String> finalResults = new HashMap <String, String>();
				try {
					Database db = new Database();
					
					ResultSet dbResults = db.execute("SELECT * FROM staff;");
					if(dbResults != null) {
						while (dbResults.next()) {
							HashMap<String, String> items = new HashMap<String, String>();
		
							items.put("IDNumber", String.valueOf(dbResults.getInt(1)));
							items.put("PersonName", dbResults.getString(2));
							items.put("ShiftHours", dbResults.getString(3));
							items.put("Position", dbResults.getString(4));
							
							finalResults.put(String.valueOf(finalResults.size()), gson.toJson(items));
						}
					}
					
				}
				catch(Exception e) {
				
				}
				
		return gson.toJson(finalResults);
	}
	
	@RequestMapping(value = "/api/staff/{id}", method= RequestMethod.POST)
	public String POSTIndex() {
		return "Post";
	}
	@RequestMapping(value = "/api/staff", method= RequestMethod.PUT)
	public String PUTIndex() {
		return "Put";
	}
	@RequestMapping(value = "/api/staff/{id}", method = RequestMethod.DELETE)
		public String DELIndex(@PathVariable("id") int id) {
			HashMap <String, String> finalResults = new HashMap <String, String>();
			try {
				Database db = new Database();
				
				boolean error = db.update("DELETE FROM staff WHERE IDNumber = " + String.valueOf(id) + ";");
				
			
			}
			catch(Exception e) {
			
			}
	 		
			return gson.toJson(finalResults);
	}
	
}