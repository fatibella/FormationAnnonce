package ma.fst.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fst.demo.bean.Niveau;
import ma.fst.demo.dao.NiveauDao;
import ma.fst.demo.model.facade.NiveauService;

@Service
public class NiveauServiceImpl implements NiveauService {

	@Autowired
	public NiveauDao niveaudao;

	@Override
	public Niveau findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return niveaudao.findByLibelle(libelle);
	}

	@Override
	public Niveau save(Niveau niveau) {
		// TODO Auto-generated method stub
		return niveaudao.save(niveau);
	}

	@Override
	public List<Niveau> findAll() {
		// TODO Auto-generated method stub
		return niveaudao.findAll();
	}

	public NiveauDao getniveaudao() {
		return niveaudao;
	}

	public void setniveaudao(NiveauDao niveaudao) {
		this.niveaudao = niveaudao;
	}
}
