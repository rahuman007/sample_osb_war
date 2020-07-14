package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {

    @RequestMapping("v2/catalog")
    public String sayHello(){
        return ("{\n" + 
        		"  \"services\": [\n" + 
        		"    {\n" + 
        		"      \"id\": \"avx-email-service\",\n" + 
        		"      \"name\": \"avx-email-service\",\n" + 
        		"      \"description\": \"appviewx mailing service\",\n" + 
        		"      \"bindable\": false,\n" + 
        		"      \"plans\": [\n" + 
        		"        {\n" + 
        		"          \"id\": \"appviewx-service-plan-id-1\",\n" + 
        		"          \"name\": \"standard\",\n" + 
        		"          \"description\": \"Standard appviewx service plan\",\n" + 
        		"          \"free\": true,\n" + 
        		"          \"schemas\": {\n" + 
        		"            \"service_instance\": {\n" + 
        		"              \"create\": {\n" + 
        		"                \"parameters\": {\n" + 
        		"                  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\n" + 
        		"                  \"type\": \"object\",\n" + 
        		"                  \"properties\": {\n" + 
        		"                    \"username\": {\n" + 
        		"                      \"description\": \"Type the user name\",\n" + 
        		"                      \"title\": \"User name\",\n" + 
        		"                      \"type\": \"string\"\n" + 
        		"                    },\n" + 
        		"		\"color\": {\n" + 
        		"                      \"description\": \"Select color\",\n" + 
        		"                      \"title\": \"Color\",\n" + 
        		"                      \"type\": \"string\",\n" + 
        		"			\"enumNames\": [\"red\", \"blue\"]\n" + 
        		"                    }\n" + 
        		"                  }\n" + 
        		"                }\n" + 
        		"              }\n" + 
        		"            }\n" + 
        		"          }\n" + 
        		"        }\n" + 
        		"      ]\n" + 
        		"    }\n" + 
        		"  ]\n" + 
        		"}");
    }
    
}