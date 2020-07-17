package bootwildfly;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {

	@Value("#{systemEnvironment['MY_EXTERNAL_ENDPOINT']}")
	private String myExternalEndpoint;
	
	@Value("#{my.host}")
	private String host;
	
	@RequestMapping("hello")
    public String say(){
        return ("My property: " + myExternalEndpoint + "\nMy host:" + host);
    }
	
    @RequestMapping("v2/catalog")
    public String sayHello(){
        return ("{\"services\":[{\"id\":\"5f1011f4b958f463955d2b6e5\",\"name\":\"create-http-monitor\",\"description\":\"Create LTM HTTP Monitor\",\"bindable\":false,\"plans\":[{\"id\":\"appviewx-plan-15949062993101\",\"name\":\"standard\",\"description\":\"Standard service plan\",\"free\":true,\"schemas\":{\"service_instance\":{\"create\":{\"parameters\":{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"device_ip\":{\"description\":\"Please enter device_ip\",\"title\":\"Device ip\",\"type\":\"string\"},\"device_name\":{\"description\":\"Please enter device_name\",\"title\":\"Device name\",\"type\":\"string\"},\"interval\":{\"description\":\"Please enter interval\",\"title\":\"Interval\",\"type\":\"string\"},\"timeout\":{\"description\":\"Please enter timeout\",\"title\":\"Timeout\",\"type\":\"string\"},\"monitor_name\":{\"description\":\"Please enter monitor_name\",\"title\":\"Monitor name\",\"type\":\"string\"}}}}}}}],\"metadata\":{\"workflowName\":\"Create LTM HTTP Monitor\"}}]}");
    }
    
}