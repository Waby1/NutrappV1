package co.simplon.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import co.simplon.model.alimentModel;



@Named
public interface alimentRepository extends JpaRepository<alimentModel, Long> {
	List<alimentModel> findByName(String name);
	Optional<alimentModel> findById(Long Id);
	public List<alimentModel> findByNameLike(@Param("name") String name);
}
