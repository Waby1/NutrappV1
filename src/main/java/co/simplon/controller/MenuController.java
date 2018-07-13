package co.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.simplon.model.MenuModel;
import co.simplon.repository.MenuRepository;

@Controller
@RequestMapping("/menu")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuController {

	@Autowired
	MenuRepository menuRepository;

	@PostMapping
	public MenuModel createMenu(MenuModel menu) {
		return menu;
	
	}

}
