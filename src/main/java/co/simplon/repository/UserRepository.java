package co.simplon.repository;


import co.simplon.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import javax.inject.Named;
import java.util.List;
import java.util.Optional;


@Named
public interface UserRepository extends JpaRepository<UserModel, Long> {
	List<UserModel> findByName(String name);

	Optional<UserModel> findById(Long Id);

	public List<UserModel> findByNameLike(@Param("name") String name);

}
