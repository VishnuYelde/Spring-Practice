package annotationBasedConfig.listDI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "annotationBasedConfig.listDI")
public class AppConfig {

	@Bean
	public List<String> getSubjects() {
		return Arrays.asList("Java", "Hibernate", "Spring");
	}
	
	@Bean
	public Map<String, Double> getItems(){
		return Map.of("Poco", 20000.0, "Samsung", 95000.0);
	}
	
	
}
