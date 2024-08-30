package interswitch.assessment.discoveryfintechdigitalonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//THis annotation is need to indicate that this is a discovery server and this will be available after the library has been imported
@EnableEurekaServer
public class DiscoveryfintechdigitalonlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryfintechdigitalonlyApplication.class, args);
    }

}
