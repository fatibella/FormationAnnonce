package ma.fst.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fst.demo.bean.Module;
import ma.fst.demo.dao.ModuleDao;
import ma.fst.demo.model.facade.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	public ModuleDao moduledao;

	@Override
	public Module findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return moduledao.findByLibelle(libelle);
	}

	@Override
	public Module save(Module module) {
		// TODO Auto-generated method stub
		return moduledao.save(module);
	}

	@Override
	public List<Module> findAll() {
		// TODO Auto-generated method stub
		return moduledao.findAll();
	}

	public ModuleDao getModuledao() {
		return moduledao;
	}

	public void setModuledao(ModuleDao moduledao) {
		this.moduledao = moduledao;
	}

}
