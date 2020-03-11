package ma.fst.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fst.demo.bean.AnnonceFormation;
import ma.fst.demo.model.facade.AnnonceFormationService;

@RestController
@RequestMapping("/stock/annonceFormation")
public class AnnonceFormationServiceRest {

	@Autowired
	private AnnonceFormationService annonceFormationservice;

	@GetMapping("/")
	public List<AnnonceFormation> findAll() {
		return annonceFormationservice.findAll();
	}

	@GetMapping("/reference/{reference}")
	public AnnonceFormation findByReference(@PathVariable String reference) {
		return annonceFormationservice.findByReference(reference);
	}

	@PostMapping("/")
	public AnnonceFormation save(@RequestBody AnnonceFormation annonceFormation) {
		return annonceFormationservice.save(annonceFormation);
	}

	public AnnonceFormationService getAnnonceFormationservice() {
		return annonceFormationservice;
	}

	public void setAnnonceFormationservice(AnnonceFormationService annonceFormationservice) {
		this.annonceFormationservice = annonceFormationservice;
	}

}
