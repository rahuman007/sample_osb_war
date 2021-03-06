package bootwildfly;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {

	@Value("${MY_EXTERNAL_ENDPOINT}")
	private String myExternalEndpoint;
	
	@Value("${MY_HOST}")
	private String myHost;
	
	@Value("${APPVIEWX_USERNAME}")
	private String username;
	
	@Value("${APPVIEWX_PASSWORD}")
	private String password;
	
	@RequestMapping("hello")
    public String say() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("myhost: ").append(myHost);
		sBuilder.append("my propery: ").append(myExternalEndpoint)
			.append("username: ").append(username).append("password: ").append(password);
		System.out.println(sBuilder.toString());
        return ("My property: " + myExternalEndpoint);
    }
	
    @RequestMapping("v2/catalog")
    public String sayHello(){
        return ("{\"services\":[{\"id\":\"5f1011f4b958f463955d2b6e5\",\"name\":\"create-http-monitor\",\"description\":\"Create LTM HTTP Monitor\",\"bindable\":false,\"plans\":[{\"id\":\"appviewx-plan-15949062993101\",\"name\":\"standard\",\"description\":\"Standard service plan\",\"free\":true,\"schemas\":{\"service_instance\":{\"create\":{\"parameters\":{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"username\":{\"title\":\"User name\",\"description\":\"Type the user name.\",\"type\":\"string\"},\"key\":{\"title\":\"Access key\",\"description\":\"Type your access key.\",\"type\":\"string\",\"default\":\"default value\",\"x-schema-form\":{\"type\":\"textarea\"}}},\"required\":[\"username\"]}}}}}],\"metadata\":{\"workflowName\":\"Create LTM HTTP Monitor\"}}]}");
    }
    
}