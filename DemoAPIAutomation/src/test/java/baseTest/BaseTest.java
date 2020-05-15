package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import utils.ExtentReportListener;
import utils.FileAndEnv;

@Listeners(ExtentReportListener.class)
public class BaseTest extends ExtentReportListener{
	
	@BeforeClass
	public void baseTest() {
		
		//System.out.println(FileAndEnv.envAndFile());
		
		//RestAssured.baseURI = "http://localhost:3000/";
		//System.out.println("FileAndEnv.envAndFile().get(\"ServerURL\") value is " + FileAndEnv.envAndFile().get("ServerURL"));
		//test.log(LogStatus.INFO, "Server URL: " + FileAndEnv.envAndFile().get("ServerURL"));
		RestAssured.baseURI = FileAndEnv.envAndFile().get("ServerURL");
	}

}
