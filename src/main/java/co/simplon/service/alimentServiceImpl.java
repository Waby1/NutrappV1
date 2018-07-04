//package co.simplon.service;
//
//import co.simplon.model.AlimentModel;
//import co.simplon.repository.AlimentRepository;
//
//import javax.inject.Inject;
//import javax.inject.Named;
//
//@Named
//public class alimentServiceImpl implements alimentService {
//
//	@Inject
//	AlimentRepository alimentRepository;
//
//	public AlimentModel saveAliment(AlimentModel alimentModel) {
//		AlimentRepository.save(alimentModel);
//		return alimentModel;
//	    }
//
////	public List<AlimentModel> getAll() {
////		return AlimentRepository.findAll();
////	    }
////
////
////	public Optional<AlimentModel> findbyId(Long id) {
////
////		return AlimentRepository.findById(id);
////	    }
////
//}