package co.simplon.service;



import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import co.simplon.model.userModel;


@Named
public interface userService {
	
	public userService saveUser (userService userService);
	public List<userService> getAll();
	public Optional<userService> findbyId(long id);

}
