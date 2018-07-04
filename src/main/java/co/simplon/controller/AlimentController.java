package co.simplon.controller;

import co.simplon.repository.AlimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


		
@Controller
public class AlimentController {

	@Autowired
	AlimentRepository alimentRepository;


	@GetMapping("/aliments.html")
	public ModelAndView alimentList() {
		ModelAndView modelAndView = new ModelAndView("aliments");
		modelAndView.addObject("aliments", alimentRepository.findAll());
		return modelAndView;
	}

	

}
