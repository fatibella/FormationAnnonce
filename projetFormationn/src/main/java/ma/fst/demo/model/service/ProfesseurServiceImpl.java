package ma.fst.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fst.demo.bean.Professeur;
import ma.fst.demo.dao.ProfesseurDao;
import ma.fst.demo.model.facade.ProfesseurService;

@Service
public class ProfesseurServiceImpl implements ProfesseurService {
	@Autowired
	public ProfesseurDao profdao;

	@Override
	public Professeur findByReference(String reference) {
		// TODO Auto-generated method stub
		return profdao.findByReference(reference);
	}

	@Override
	public Professeur save(Professeur prof) {
		// TODO Auto-generated method stub
		return profdao.save(prof);
	}

	@Override
	public List<Professeur> findAll() {
		// TODO Auto-generated method stub
		return profdao.findAll();
	}

	public ProfesseurDao getprofdao() {
		return profdao;
	}

	public void setprofdao(ProfesseurDao profdao) {
		this.profdao = profdao;
	}
}