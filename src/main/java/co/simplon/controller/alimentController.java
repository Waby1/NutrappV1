package co.simplon.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.simplon.model.alimentModel;
import co.simplon.service.alimentService;


		
@Controller
@RequestMapping("/list-aliment")
public class alimentController {
	
	@Inject
	alimentService alimentService ;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<alimentModel> findAll() {
		/*List<alimentModel> foos = new ArrayList<alimentModel>();
		alimentModel foo1 = new alimentModel ( " Test 1 ");
		alimentModel foo2 = new alimentModel ("Test 2");
		
		foos.add(foo1);
		foos.add(foo2);
		
	    return foos;*/
		
		return alimentService.getAll();
	}
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public alimentModel alimentCreate(@RequestBody alimentModel aliment) {
		return alimentService.saveAliment(aliment);
		
	}
	
	

}
