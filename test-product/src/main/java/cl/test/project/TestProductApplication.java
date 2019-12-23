package cl.test.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication/*
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("com.delivery.repository")*/
public class TestProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProductApplication.class, args);
	}

}
