/*package co.simplon.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import co.simplon.model.UserModel;
import co.simplon.repository.userRepository;

@Named
public class userServiceImpl implements userService{
	
	@Inject
	userRepository userRepository;
	
	public UserModel saveUser(UserModel test) {
		userRepository.save(test);
		return test;
	}
        public List<UserModel> getAll() {
        	return null ;
        }
        
        public Optional<UserModel> findbyId(Long id) {
        	return userRepository.findById(id);
        }
}*/
