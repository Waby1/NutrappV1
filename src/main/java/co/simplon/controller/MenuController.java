package co.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.model.MenuModel;
import co.simplon.repository.MenuRepository;

//RestController est utilisé pour permettre la transformation en jason
@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuController {

	@Autowired
	MenuRepository menuRepository;

	@PostMapping
	public MenuModel createMenu(@RequestBody MenuModel menu) {
		System.out.println("json recu :");
		System.out.println(menu);
		menuRepository.save(menu);
		return menu;
	
	}

}
