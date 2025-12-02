package annotationBasedConfig.theater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Theater {
	
//	@Value(value = "INOX")
	private String name;
	
//	@Value(value = "Thane")
	private String address;
	
//	@Autowired
//	@Qualifier(value = "chaava")
	private Movie movie;
	
	public void playMovie() {
		System.out.println("In theatre "+name+", a movies given below is playing at "+address);
		movie.story();
	}

//	@Autowired
//	@Qualifier(value = "kantara")
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	
	public Theater(@Value(value = "INOX") String name, @Value(value = "Thane") String address, @Autowired @Qualifier(value = "chaava") Movie movie) {
		this.name = name;
		this.address = address;
		this.movie = movie;
	}
	
}
