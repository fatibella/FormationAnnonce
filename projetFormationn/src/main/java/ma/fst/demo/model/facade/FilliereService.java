package ma.fst.demo.model.facade;

import java.util.List;

import ma.fst.demo.bean.Filliere;

public interface FilliereService {

	

	public Filliere findByReference(String reference);

	public Filliere save(Filliere filliere);

	public List<Filliere> findAll();
}
