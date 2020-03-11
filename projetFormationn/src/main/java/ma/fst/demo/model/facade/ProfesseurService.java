package ma.fst.demo.model.facade;

import java.util.List;

import ma.fst.demo.bean.Professeur;

public interface ProfesseurService {
	public Professeur findByReference(String reference);

	public Professeur save(Professeur prof);

	public List<Professeur> findAll();
}
