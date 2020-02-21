package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.Professeur;

@Repository
public interface ProfesseurDao extends JpaRepository<Professeur, Long> {

	public Professeur findByRef(String ref);

}
