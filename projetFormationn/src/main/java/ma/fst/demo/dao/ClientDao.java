package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {

	public Client findByCin(String cin);
	



}
