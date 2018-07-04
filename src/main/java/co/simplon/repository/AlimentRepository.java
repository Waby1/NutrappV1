package co.simplon.repository;

import co.simplon.model.AlimentModel;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import java.util.List;


@Named
public interface AlimentRepository extends CrudRepository<AlimentModel, Long> {
	// find an aliment by his name
	AlimentRepository findByName(String name);

	List<AlimentModel> findByNameIgnoreCase(String name);


}

