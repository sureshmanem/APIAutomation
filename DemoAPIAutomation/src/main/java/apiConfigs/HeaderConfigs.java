package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {
	
	public Map<String, String> defaultHeaders(){
		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");
		defaultHeaders.put("test key", "test value");
		return defaultHeaders;
	}
	
	public Map<String, String> headersWithToken(){
		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");
		defaultHeaders.put("Access_Token", "aasdfasewrwrjson");
		defaultHeaders.put("jwt_token", "aasdfasewrwrjson");
		defaultHeaders.put("Tenet_user", "test");
		return defaultHeaders;
	}
	
	//
	//public static void main(String[] args) {
	//	HeaderConfigs hed = new HeaderConfigs();
	//	System.out.println(hed.defaultHeaders());
	//}
	//

}
