package com.stockManagePortfolio.stockManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(scanBasePackages = {"com.user", "com.config"})
@SpringBootApplication(
    scanBasePackages = {
        "com.stockManagePortfolio.stockManager",
        "com.user",
        "com.config"
    }
)
@EnableJpaRepositories(basePackages = "com.user.repository")
@EntityScan(basePackages = "com.user.entity")


public class StockManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockManagerApplication.class, args);
	}

}
