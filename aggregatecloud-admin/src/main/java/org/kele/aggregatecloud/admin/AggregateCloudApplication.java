package org.kele.aggregatecloud.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.kele.*")
public class AggregateCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregateCloudApplication.class, args);
	}

}
