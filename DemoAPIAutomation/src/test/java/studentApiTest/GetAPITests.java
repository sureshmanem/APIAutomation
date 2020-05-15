package studentApiTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.APIPath;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest{
	
	@Test
	public void getAPITest() {
		//First Direct Way
		//RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS).then().log().all().statusCode(200);
		test.log(LogStatus.INFO, "My test for GET is starting....");
		
		//Second Direct Way
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS);
//		System.out.println(response.getBody().asString());
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getCookies());
//		System.out.println(response.getTime());

		//Third Direct Way
//		test.log(LogStatus.INFO, "My Response Body is " + response.getBody().asString());
//		test.log(LogStatus.INFO, "My Status Code is " + response.getStatusCode());
//		test.log(LogStatus.INFO, "My Response Time is " + response.getTime());
		//Validating the Response
//		JSONArray array = new JSONArray(response.getBody().asString());
//		for(int i=0;i<array.length();i++) {
//			System.out.println(array.get(i));
//			JSONObject obj = array.getJSONObject(i);
//			test.log(LogStatus.INFO, "Validated values are " + obj.get("title"));
//			//System.out.println(obj.get("title"));
//		}
//		test.log(LogStatus.PASS, "My test is pass....");
//		test.log(LogStatus.INFO, "My test is complete...");
		
		//Real - Time Method
		APIVerification.responseCodeValidation(response, 200);
		APIVerification.responseTimeValidation(response);
		APIVerification.responseKeyValidationFromArray(response, "id", "ID");
		APIVerification.responseKeyValidationFromArray(response, "title", "Title");
		APIVerification.responseKeyValidationFromArray(response, "author", "Author");
		
		test.log(LogStatus.INFO, "My test for GET is complete....");
	}
}
