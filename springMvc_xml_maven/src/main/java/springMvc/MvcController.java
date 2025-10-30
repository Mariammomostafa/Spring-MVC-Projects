package springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String processOrder(@RequestParam("item") String food, HttpServletRequest req ,Model model) {
		
		//String  itemName = (String) req.getAttribute("item");
		model.addAttribute("item" , food);
	        return "processOrder";
	}

}
