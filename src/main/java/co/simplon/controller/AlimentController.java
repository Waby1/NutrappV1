package co.simplon.controller;

import co.simplon.model.AlimentModel;
import co.simplon.repository.AlimentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;


@Controller
@RequestMapping("/api/aliments")
@CrossOrigin(origins = "http://localhost:4200")
class AlimentController {

	//@Autowired
	@Inject
	AlimentRepository alimentRepository;

	@GetMapping
	@ResponseBody
	public List<AlimentModel> list() {
		return alimentRepository.findAll();
	}

//	@PutMapping
//	@ResponseBody
//	public AlimentModel creation(@RequestBody AlimentModel toto) {
//		return toto;
//	}
}

