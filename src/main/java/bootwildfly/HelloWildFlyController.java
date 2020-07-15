package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {

    @RequestMapping("v2/catalog")
    public String sayHello(){
        return ("{\"services\":[{\"id\":\"avx-email-service\",\"name\":\"avx-email-service\",\"description\":\"appviewx mailing service\",\"bindable\":false,\"plans\":[{\"id\":\"appviewx-service-plan-id-1\",\"name\":\"standard\",\"description\":\"Standard appviewx service plan\",\"free\":true,\"schemas\":{\"service_instance\":{\"create\":{\"parameters\":{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"username\":{\"description\":\"Type the user name\",\"title\":\"User name\",\"type\":\"string\",\"default\":\"default value\"},\"gender\":{\"enum\":[\"Male\",\"Female\"],\"type\":\"string\"},\"backupRedundancy\":{\"default\":\"geo\",\"description\":\"Specifies the backup redundancy\",\"oneOf\":[{\"enum\":[\"local\"],\"title\":\"Local Label\"},{\"enum\":[\"geo\"],\"title\":\"Geo Label\"}],\"title\":\"Backup redundancy\",\"type\":\"string\"}}}}}}}]}]}");
    }
    
}