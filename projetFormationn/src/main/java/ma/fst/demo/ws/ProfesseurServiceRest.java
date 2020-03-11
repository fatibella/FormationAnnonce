package ma.fst.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fst.demo.bean.Professeur;
import ma.fst.demo.model.facade.ProfesseurService;

@RestController
@RequestMapping("/stock/prof")
public class ProfesseurServiceRest {
	@Autowired
	private ProfesseurService profservice;

	@GetMapping("/")
	public List<Professeur> findAll() {
		return profservice.findAll();
	}

	@GetMapping("/reference/{reference}")
	public Professeur findByReference(@PathVariable String reference) {
		return profservice.findByReference(reference);
	}

	@PostMapping("/")
	public Professeur save(@RequestBody Professeur prof) {
		return profservice.save(prof);
	}

	public ProfesseurService getProfesseurservice() {
		return profservice;
	}

	public void setProfesseurservice(ProfesseurService profservice) {
		this.profservice = profservice;
	}
}
