package co.simplon.repository;

import co.simplon.model.FoodGroup;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;

@Named
public interface FoodGroupRepository extends CrudRepository<FoodGroup, Long> {
}
