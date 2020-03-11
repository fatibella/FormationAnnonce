package ma.fst.demo.model.facade;

import java.util.List;

import ma.fst.demo.bean.AnnonceFormation;

public interface AnnonceFormationService {


	

	public AnnonceFormation findByReference(String reference);

	public AnnonceFormation save(AnnonceFormation annonceFormation);

	public List<AnnonceFormation> findAll();
}
