package demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.mvc.UserDTO;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MessageController {

	@GetMapping("/msg")
	public String getMessage() {
		System.out.println("Message API is triggered");
		return "message.jsp";
	}

	@GetMapping("/greet")
	public String greet() {
		System.out.println("Greet page is Triggered");
		return "greet.jsp";
	}

	@GetMapping("/reg")
	public String getRegisterPage(Model model) {
		System.out.println("Returing Register page");
		model.addAttribute("udto", new UserDTO());
		return "register.jsp";
	}

	@PostMapping("/regis")
	public String registerUser(UserDTO udto) {
		System.out.println(udto);
		
		return "register.jsp";
	}

	@GetMapping("/data")
	public String sendDatausingModel(Model model) {
		model.addAttribute("username", "King");
		model.addAttribute("userage", 25);

		return "display.jsp";
	}

	@GetMapping("/send-data")
	public ModelAndView sendDataUsingMV() {
		ModelAndView mv = new ModelAndView("data.jsp");
		mv.addObject("un", "Allen");
		mv.addObject("ua", 50);

		return mv;
	}

	@PostMapping("/log")
	public String login(HttpServletRequest request, Model model) {
		String username = request.getParameter("un");
		String password = request.getParameter("pwd");

		// display home page if name & password Correct OR thow Invalid INFO
		if (username.equals("tony") && password.equals("tony123")) {
			model.addAttribute("username", username);
			return "home.jsp";
		} else {
			model.addAttribute("msg", "Invalid Details");
			return "login.jsp";
		}

	}
}
