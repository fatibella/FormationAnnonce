package ma.fst.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fst.demo.bean.Module;
import ma.fst.demo.model.facade.ModuleService;

@RestController
@RequestMapping("/stock/module")
public class ModuleServiceRest {

	@Autowired
	private ModuleService moduleservice;

	@GetMapping("/")
	public List<Module> findAll() {
		return moduleservice.findAll();
	}

	@GetMapping("/libelle/{libelle}")
	public Module findByLibelle(@PathVariable String libelle) {
		return moduleservice.findByLibelle(libelle);
	}

	@PostMapping("/")
	public Module save(@RequestBody Module module) {
		return moduleservice.save(module);
	}

	public ModuleService getModuleservice() {
		return moduleservice;
	}

	public void setModuleservice(ModuleService moduleservice) {
		this.moduleservice = moduleservice;
	}

}
