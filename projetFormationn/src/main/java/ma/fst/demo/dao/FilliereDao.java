package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.Filliere;

@Repository
public interface FilliereDao extends JpaRepository<Filliere, Long> {

	public Filliere findByReference(String reference);
}
