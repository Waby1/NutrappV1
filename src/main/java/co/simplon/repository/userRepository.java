package co.simplon.repository;


import java.util.List;
import java.util.Optional;

import javax.inject.Named;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import co.simplon.model.userModel;


@Named
public interface userRepository extends JpaRepository<userModel, Long> {
	List<userModel> findByName(String name);
	Optional<userModel> findById(Long Id);
	public List<userModel> findByNameLike(@Param("name") String name);

}
