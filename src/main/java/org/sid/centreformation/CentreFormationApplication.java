package org.sid.centreformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.sid.centreformation"})
public class CentreFormationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentreFormationApplication.class, args);
	}

}
