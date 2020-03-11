package ma.fst.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fst.demo.bean.Filliere;
import ma.fst.demo.dao.FilliereDao;
import ma.fst.demo.model.facade.FilliereService;

@Service
public class FilliereServiceImpl implements FilliereService {
	@Autowired
	public FilliereDao fillieredao;

	@Override
	public Filliere findByReference(String reference) {
		// TODO Auto-generated method stub
		return fillieredao.findByReference(reference);
	}

	@Override
	public Filliere save(Filliere filliere) {
		// TODO Auto-generated method stub
		return fillieredao.save(filliere);
	}

	@Override
	public List<Filliere> findAll() {
		// TODO Auto-generated method stub
		return fillieredao.findAll();
	}

	public FilliereDao getFillieredao() {
		return fillieredao;
	}

	public void setFillieredao(FilliereDao fillieredao) {
		this.fillieredao = fillieredao;
	}

}
