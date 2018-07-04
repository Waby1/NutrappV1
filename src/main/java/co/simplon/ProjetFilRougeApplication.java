package co.simplon;

import co.simplon.model.AlimentModel;
import co.simplon.model.MenuModel;
import co.simplon.repository.AlimentRepository;
import co.simplon.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjetFilRougeApplication {

	//injecting Repositories
	@Autowired
	private AlimentRepository alimentRepository;
	@Autowired
	private MenuRepository menuRepository;




	public static void main(String[] args) {
		SpringApplication.run(ProjetFilRougeApplication.class, args);
	}


	@Bean
	CommandLineRunner runner() {
		return args -> {

			// we insert aliments into database

			AlimentModel courgette = new AlimentModel(null, "Courgette", 100, 12);
			alimentRepository.save(courgette);
			AlimentModel patate = new AlimentModel(null, "Patate", 6, 4);
			alimentRepository.save(patate);
			AlimentModel chouxDeBrussels = new AlimentModel(null, "Choux de Brussels", 12, 5);
			alimentRepository.save(chouxDeBrussels);

			// we create a menu
			List<AlimentModel> menu1 = new ArrayList<>();
			menu1.add(courgette);
			menu1.add(patate);
			menu1.add(chouxDeBrussels);
			MenuModel menuDuJour = new MenuModel(null, "Menu du jour", 0, menu1);
			menuRepository.save(menuDuJour);
			alimentRepository.save(patate);
			alimentRepository.save(courgette);
			alimentRepository.save(chouxDeBrussels);

		};
	}
}
