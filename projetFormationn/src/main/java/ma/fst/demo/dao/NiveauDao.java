package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.Niveau;

@Repository
public interface NiveauDao extends JpaRepository<Niveau, Long> {

	public Niveau findByLibelle(String Libelle);
}
