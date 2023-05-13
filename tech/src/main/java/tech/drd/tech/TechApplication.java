package tech.drd.tech;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class TechApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechApplication.class, args);
	}
	
	@Configuration
	public class DataSourceConfig {
	    @Bean
	    public DataSource getDataSource() {
	        return DataSourceBuilder.create()
	          .driverClassName("com.mysql.cj.jdbc.Driver")
	          .url("jdbc:mysql://localhost:3306/innovation_admin_root")
	          .username("root")
	          .password("tushar")
	          .build();	
	    }
	}

}
