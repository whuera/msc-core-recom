package ec.com.core.springrestfulservices;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The Class SpringRestfulservicesApplication.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "ec.com.core.springrestfulservices.repository")
@EntityScan(basePackages = "ec.com.core.springrestfulservices.model")
public class SpringRestfulservicesApplication extends SpringBootServletInitializer{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringRestfulservicesApplication.class, args);
	}
}


