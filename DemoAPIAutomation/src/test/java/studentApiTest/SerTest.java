package studentApiTest;

import org.testng.annotations.Test;

import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.PostAPIPojo;

public class SerTest extends BaseTest{
	
	@Test
	public void serTest1() {
		
		HeaderConfigs head = new HeaderConfigs();
		PostAPIPojo pojo = new PostAPIPojo(22,"sertest","suresh");
		
		Response response = RestAssured.given().when().headers(head.defaultHeaders()).body(pojo)
				.post(APIPath.apiPath.CREATE_POST);
		System.out.println(response.getBody().asString());
		//System.out.println(pojo.getAuthor());
		//System.out.println(pojo.getId());
		System.out.println(pojo.toString());
	
	}

}
