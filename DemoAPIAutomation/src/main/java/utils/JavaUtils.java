package utils;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class JavaUtils {
	
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
