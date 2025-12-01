package annotationBasedConfig.theater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Theater {
	
	@Value(value = "INOX")
	private String name;
	
	@Value(value = "Thane")
	private String address;
	
	@Autowired
	private Movie movie;
	
	public void playMovie() {
		System.out.println("In theatre "+name+", a movies given below is playing at "+address);
		movie.story();
	}
}
