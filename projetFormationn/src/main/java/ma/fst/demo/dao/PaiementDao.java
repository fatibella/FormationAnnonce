package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.Client;
import ma.fst.demo.bean.Paiement;



@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {

	public Paiement findByClient(Client client);
}
