package studentApiTest;

import org.testng.annotations.Test;

import pojo.Credentials;
import utils.JavaUtils;

public class LoginTest {
	
	@Test
	public void loginTest() {
		Credentials logincred = JavaUtils.base64Encode("admin", "admin123");
		System.out.println(logincred);
	}
	
}
