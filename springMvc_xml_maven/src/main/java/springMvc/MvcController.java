package springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MvcController {
	
	
	@GetMapping("/home")
	public String home() {
		
		 System.out.println("THis is home url");
	        return "home";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		

	        return "welcome";
	}
	
	@GetMapping("/processOrder")
	public String processOrder(HttpServletRequest req ,Model model) {
		
		String  itemName = req.getAttribute("item").toString();
		model.addAttribute("item" , itemName);
	        return "processOrder";
	}

}
