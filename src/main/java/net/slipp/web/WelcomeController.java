package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/helloworld")
	public String welcome(Model model) {
		model.addAttribute("name", "wooyong");
		model.addAttribute("value", 10000);
		model.addAttribute("taxed_value", 30);
		model.addAttribute("in_ca", true);
		return "welcome";
	}
}
