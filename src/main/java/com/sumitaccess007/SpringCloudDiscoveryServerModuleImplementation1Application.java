package com.sumitaccess007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDiscoveryServerModuleImplementation1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDiscoveryServerModuleImplementation1Application.class, args);
	}

}
