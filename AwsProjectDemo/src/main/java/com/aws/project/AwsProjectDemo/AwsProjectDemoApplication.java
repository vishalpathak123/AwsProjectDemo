package com.aws.project.AwsProjectDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * 
 * @author VISHAL KUMAR
 *
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AwsProjectDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsProjectDemoApplication.class, args);
	}

}
