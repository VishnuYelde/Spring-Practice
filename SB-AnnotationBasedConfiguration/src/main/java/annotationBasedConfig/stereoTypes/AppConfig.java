package annotationBasedConfig.stereoTypes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "annotationBasedConfig.steroTypes")
public class AppConfig {
	
	@Bean
	@Scope(value = "prototype")    // change scope of bean class laptop
	public Laptop getLaptop() {
		return new Laptop();
	}
}
