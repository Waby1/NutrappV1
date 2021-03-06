package co.simplon.repository;

import co.simplon.model.AlimentModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AlimentRepository extends CrudRepository<AlimentModel, Long> {
	// find an aliment by his name
	AlimentRepository findByName(String name);

	List<AlimentModel> findByNameIgnoreCase(String name);

	List<AlimentModel> findAll();


}

