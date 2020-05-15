package utils;

import java.util.Base64;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import pojo.Credentials;

public class JavaUtils {
	
	public static Credentials base64Encode(final String username,final String password) {
		String cred = username + ":" + password;
		try {
			cred = Base64.getEncoder().encodeToString(cred.getBytes());
			System.out.println(cred);
		}catch(Exception e) {
			
		}
		
		Credentials loginCred = new Credentials();
		loginCred.setCredentials(cred);
		
		return loginCred;
		
	}
	
	public static String randomNumber() {
		
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		String randomNum = Integer.toString(randomNumber);
		
		return randomNum;
	}
	
	public static String randomString() {
		String randomString = RandomStringUtils.randomAlphabetic(8);
		return randomString;
	}

}
