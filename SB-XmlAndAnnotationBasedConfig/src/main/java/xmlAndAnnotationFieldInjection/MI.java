package xmlAndAnnotationFieldInjection;

import org.springframework.stereotype.Component;

// Component annotation is also used to Rename Bean class Id

@Component(value = "myMI")
public class MI {
	public void play() {
		System.out.println("============MI IPL Team============");
		System.out.println("MI Playing Cricket");
	}
}
