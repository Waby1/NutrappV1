package co.simplon.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import co.simplon.model.userModel;
import co.simplon.repository.userRepository;

@Named
public class userServiceImpl implements userService{
	
	@Inject
	userRepository userRepository;
	
	public userModel saveUser(userModel test) {
		userRepository.save(test);
		return test;
	}
        public List<userModel> getAll() {
        	return null ;
        }
        
        public Optional<userModel> findbyId(Long id) {
        	return userRepository.findById(id);
        }
}
