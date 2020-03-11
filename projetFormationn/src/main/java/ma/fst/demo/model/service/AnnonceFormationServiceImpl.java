package ma.fst.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fst.demo.bean.AnnonceFormation;
import ma.fst.demo.dao.AnnonceFormationDao;
import ma.fst.demo.model.facade.AnnonceFormationService;

@Service
public class AnnonceFormationServiceImpl implements AnnonceFormationService {
	@Autowired
	public AnnonceFormationDao annonceFormationdao;

	@Override
	public AnnonceFormation findByReference(String reference) {
		// TODO Auto-generated method stub
		return annonceFormationdao.findByReference(reference);
	}

	@Override
	public AnnonceFormation save(AnnonceFormation annonceFormation) {
		// TODO Auto-generated method stub
		return annonceFormationdao.save(annonceFormation);
	}

	@Override
	public List<AnnonceFormation> findAll() {
		// TODO Auto-generated method stub
		return annonceFormationdao.findAll();
	}

	public AnnonceFormationDao getAnnonceFormationdao() {
		return annonceFormationdao;
	}

	public void setAnnonceFormationdao(AnnonceFormationDao annonceFormationdao) {
		this.annonceFormationdao = annonceFormationdao;
	}

}
