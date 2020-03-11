package ma.fst.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fst.demo.bean.Filliere;
import ma.fst.demo.model.facade.FilliereService;

@RestController
@RequestMapping("/stock/filliere")
public class FilliereServiceRest {

	@Autowired
	private FilliereService filliereservice;

	@GetMapping("/")
	public List<Filliere> findAll() {
		return filliereservice.findAll();
	}

	@GetMapping("/reference/{reference}")
	public Filliere findByReference(@PathVariable String reference) {
		return filliereservice.findByReference(reference);
	}

	@PostMapping("/")
	public Filliere save(@RequestBody Filliere filliere) {
		return filliereservice.save(filliere);
	}

	public FilliereService getFilliereservice() {
		return filliereservice;
	}

	public void setFilliereservice(FilliereService filliereservice) {
		this.filliereservice = filliereservice;
	}

}
