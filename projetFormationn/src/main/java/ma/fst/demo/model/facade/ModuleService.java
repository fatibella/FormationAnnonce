package ma.fst.demo.model.facade;

import java.util.List;

import ma.fst.demo.bean.Module;

public interface ModuleService {

	public Module findByLibelle(String libelle);

	public Module save(Module module);

	public List<Module> findAll();

}
