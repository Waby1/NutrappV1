package co.simplon.service;


import javax.inject.Named;
import java.util.List;
import java.util.Optional;


@Named
public interface userService {
	
	public userService saveUser (userService userService);
	public List<userService> getAll();
	public Optional<userService> findbyId(long id);

}
