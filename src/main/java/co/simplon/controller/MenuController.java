package co.simplon.controller;

import co.simplon.model.MenuModel;
import co.simplon.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//RestController est utilisé pour permettre la transformation en jason
@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuController {

	@Autowired
	MenuRepository menuRepository;

	// methode de creation d'un menu, on utilise le post pour envoyer des données à enregistrer,
	// on utilise en paramètre un @RequestBody puisque l'on va chercher l'objet généré en front par Angular pour chercher à l'enregistrer en bdd
	@PostMapping
	public MenuModel createMenu(@RequestBody MenuModel menu) {
		System.out.println("json recu :");
		System.out.println(menu);
		menuRepository.save(menu);
		return menu;

	}

}
