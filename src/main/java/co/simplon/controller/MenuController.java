package co.simplon.controller;

import co.simplon.model.MenuModel;
import co.simplon.repository.MenuRepository;
import co.simplon.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//RestController est utilisé pour permettre la transformation en json
@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@Autowired
	private MenuRepository menuRepository;

	// methode de creation d'un menu, on utilise le post pour envoyer des données à enregistrer,
	// on utilise en paramètre un @RequestBody puisque l'on va chercher l'objet généré en front par Angular pour chercher à l'enregistrer en bdd

	@PostMapping
	public MenuModel createMenu(@RequestBody MenuModel menu) {
		menuService.createMenu(menu);
		return menu;
	}

	// méthode pour envoyer menus vers le front
	@GetMapping
	public Iterable<MenuModel> displayMenus() {
		Iterable<MenuModel> list = menuRepository.findAll();
		return list;
	}

}
