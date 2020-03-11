package ma.fst.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fst.demo.bean.Niveau;
import ma.fst.demo.model.facade.NiveauService;

@RestController
@RequestMapping("/stock/niveau")
public class NiveauServiceRest {
	@Autowired
	private NiveauService niveauservice;

	@GetMapping("/")
	public List<Niveau> findAll() {
		return niveauservice.findAll();
	}

	@GetMapping("/libelle/{libelle}")
	public Niveau findByLibelle(@PathVariable String libelle) {
		return niveauservice.findByLibelle(libelle);
	}

	@PostMapping("/")
	public Niveau save(@RequestBody Niveau niveau) {
		return niveauservice.save(niveau);
	}

	public NiveauService getNiveauservice() {
		return niveauservice;
	}

	public void setNiveauservice(NiveauService niveauservice) {
		this.niveauservice = niveauservice;
	}
}
