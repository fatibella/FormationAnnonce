package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.AnnonceFormation;

@Repository
public interface AnnonceFormationDao extends JpaRepository<AnnonceFormation, Long> {

	public AnnonceFormation findByprix(int prix);

	public AnnonceFormation findByReference(String reference);

}
