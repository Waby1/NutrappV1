package co.simplon.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import co.simplon.model.alimentModel;
import co.simplon.repository.alimentRepository;

@Named
public class alimentServiceImpl implements alimentService {

	@Inject
	alimentRepository alimentRepository;
	 
	public alimentModel saveAliment(alimentModel foo) {
		  alimentRepository.save(foo);
		  return foo;
	    }

	    public List<alimentModel> getAll() { 
	    	 return alimentRepository.findAll(); 
	    }
	    
	    
	    public Optional<alimentModel> findbyId(Long id) {
			
       return alimentRepository.findById(id);
	    }
			
}