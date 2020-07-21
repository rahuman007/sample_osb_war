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
        return ("{\"services\":[{\"id\":\"5f1011f4b958f463955d2b6e5\",\"name\":\"create-http-monitor\",\"description\":\"Create LTM HTTP Monitor\",\"bindable\":false,\"plans\":[{\"id\":\"appviewx-plan-15949062993101\",\"name\":\"standard\",\"description\":\"Standard service plan\",\"free\":true,\"schemas\":{\"service_instance\":{\"create\":{\"parameters\":{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"payload_type\":{\"title\":\"Payload type\",\"type\":\"string\",\"enum\":[\"form-data\",\"raw\"],\"default\":\"raw\"}},\"required\":[\"payload_type\"],\"dependencies\":{\"payload_type\":{\"oneOf\":[{\"properties\":{\"payload_type\":{\"enum\":[\"raw\"]},\"payload\":{\"title\":\"Payload\",\"type\":\"string\",\"default\":\"{\\\"payload\\\":{\\\"data\\\":{\\\"input\\\":{\\\"requestData\\\":[{\\\"sequenceNo\\\":1,\\\"scenario\\\":\\\"scenario\\\",\\\"fieldInfo\\\":{\\\"device_ip\\\":\\\"192.168.40.214\\\",\\\"device_name\\\":\\\"192.168.40.214\\\",\\\"interval\\\":\\\"5\\\",\\\"timeout\\\":\\\"2\\\",\\\"monitor_name\\\":\\\"ltm_monitor_test\\\"}}]},\\\"task_action\\\":1},\\\"header\\\":{\\\"workflowName\\\":\\\"Create LTM HTTP Monitor\\\"}}}\"}}},{\"properties\":{\"payload_type\":{\"enum\":[\"form-data\"]},\"device_ip\":{\"description\":\"Please enter device_ip\",\"title\":\"Device ip\",\"type\":\"string\"},\"device_name\":{\"description\":\"Please enter device_name\",\"title\":\"Device name\",\"type\":\"string\"}},\"required\":[\"device_ip\"]}]}}}}}}}],\"metadata\":{\"workflowName\":\"Create LTM HTTP Monitor\"}}]}");
    }
    
}