package studentApiTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiBuilders.PostAPIBuilder;
import apiConfigs.APIPath.apiPath;
import apiConfigs.HeaderConfigs;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.JavaUtils;

public class PostAPITests extends BaseTest{
	
	@Test
	public void validPostAPITest() {
		
		test.log(LogStatus.INFO, "My test for POST is started...");
		HeaderConfigs header = new HeaderConfigs();
		PostAPIBuilder builder = new PostAPIBuilder();
		
		Response response = RestAssured.given().when().headers(header.defaultHeaders())
				.body(builder.postRequestBody(JavaUtils.randomNumber(),JavaUtils.randomString(),JavaUtils.randomString())).when().post(apiPath.CREATE_POST);
		//System.out.println(response.getBody().asString());
		//System.out.println(response.getStatusCode());
		
		APIVerification.responseKeyValidationFromJsonObject(response, "title");
		APIVerification.responseCodeValidation(response, 201);
		APIVerification.responseTimeValidation(response);
		
		test.log(LogStatus.INFO, "My test for POST is completed...");
	}
 
}
