package com.mailsonymathew.microservices.springcloudconfigserverv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringCloudConfigServerV2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerV2Application.class, args);
	}

}
