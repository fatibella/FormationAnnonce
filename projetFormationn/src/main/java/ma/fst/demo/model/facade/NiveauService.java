package ma.fst.demo.model.facade;

import java.util.List;

import ma.fst.demo.bean.Niveau;

public interface NiveauService {
	public Niveau findByLibelle(String libelle);

	public Niveau save(Niveau niveau);

	public List<Niveau> findAll();
}
