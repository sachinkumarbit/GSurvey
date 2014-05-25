package com.sac.gsurvey;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class JSONService {
	public JSONObject login(String userid, String password){
		JSONObject json;
		
		List<NameValuePair> data= new ArrayList<NameValuePair>();
		data.add(new BasicNameValuePair("userId",userid ));
		data.add(new BasicNameValuePair("password", password));
		
		JSONParser jsonParser= new JSONParser();
		json=jsonParser.getJSONFromUrl("http://sachinkumar.site90.com/login.php", data);
		return json;
			
	}

	public JSONObject register(String employeeId, String employeeName,
			String emailId, String mobile, String aMobile, String address,
			String blood_group) {
		// TODO Auto-generated method stub
		List<NameValuePair> regData =new ArrayList<NameValuePair>();
		regData.add(new BasicNameValuePair("employeeId", employeeId));
		regData.add(new BasicNameValuePair("employeeName", employeeName));
		regData.add(new BasicNameValuePair("emailId", emailId));
		regData.add(new BasicNameValuePair("mobile", mobile));
		regData.add(new BasicNameValuePair("aMobile", aMobile));
		regData.add(new BasicNameValuePair("address", address));
		regData.add(new BasicNameValuePair("blood_group", blood_group));
		
		JSONParser jsonParser= new JSONParser();
		JSONObject json= jsonParser.getJSONFromUrl("http://sachinkumar.site90.com/sendSMS.php", regData);

		
		return json;
	}

}
