package co.simplon;

import co.simplon.repository.AlimentRepository;
import co.simplon.repository.FoodGroupRepository;
import co.simplon.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetFilRougeApplication {

	//injecting Repositories
	@Autowired
	private AlimentRepository alimentRepository;
	@Autowired
	private MenuRepository menuRepository;
	@Autowired
	private FoodGroupRepository foodGroupRepository;




	public static void main(String[] args) {
		SpringApplication.run(ProjetFilRougeApplication.class, args);
	}


	@Bean
	CommandLineRunner runner() {
		return args -> {

//			//we insert aliments into database
//			FoodGroup legume = new FoodGroup(null, "Légume");
//			foodGroupRepository.save(legume);
//			FoodGroup fruit = new FoodGroup(null, "Fruit");
//			foodGroupRepository.save(fruit);
//			AlimentModel courgette = new AlimentModel(null, "Courgette", 100, 12, legume);
//			AlimentModel asperge = new AlimentModel(null, "Asperge", 6, 4, legume);
//			AlimentModel patate = new AlimentModel(null, "Patate", 6, 4, legume);
//			AlimentModel chouxDeBrussels = new AlimentModel(null, "Choux de Brussels", 12, 5, fruit);
//
//
//			// we create a menu
//			List<AlimentModel> menu1 = new ArrayList<>();
//			menu1.add(courgette);
//			menu1.add(patate);
//			menu1.add(chouxDeBrussels);
//			menu1.add(asperge);
//			MenuModel menuDuJour = new MenuModel(null, "Menu du jour", 0, menu1);
//			menuRepository.save(menuDuJour);
//			alimentRepository.save(patate);
//			alimentRepository.save(courgette);
//			alimentRepository.save(chouxDeBrussels);
//			alimentRepository.save(asperge);

		};
	}
}
