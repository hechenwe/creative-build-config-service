package com.sooncode.creative_build_config_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
@SpringBootConfiguration  
public class ConfigServer4CreativeBuild {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer4CreativeBuild.class, args);
	}
}
