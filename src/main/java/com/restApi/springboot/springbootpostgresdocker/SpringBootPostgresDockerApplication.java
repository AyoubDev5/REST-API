package com.restApi.springboot.springbootpostgresdocker;

import com.restApi.springboot.springbootpostgresdocker.model.Auditimpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class SpringBootPostgresDockerApplication {

	@Bean
	public AuditorAware auditorAware(){
		return  new Auditimpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostgresDockerApplication.class, args);
	}

}
