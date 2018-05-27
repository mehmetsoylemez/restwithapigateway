package secondapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondappApplication.class, args);
    }
}
