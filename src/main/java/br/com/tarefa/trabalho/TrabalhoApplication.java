package br.com.tarefa.trabalho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrabalhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoApplication.class, args);
		server.error.include-message=always
		spring.datasource.driver-class-name=org.h2.Driver
		spring.datasource.url=jdbc:h2:file:./database/TrabalhoApplication
		spring.datasource.username=sa
		spring.datasource.password=sa
		spring.jpa.show-sql=true
		spring.jpa.hibernate.ddl-auto=create
				#spring.jpa.hibernate.ddl-auto=update

}
