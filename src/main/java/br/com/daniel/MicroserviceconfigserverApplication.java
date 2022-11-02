package br.com.daniel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceconfigserverApplication.class, args);
	}

}
