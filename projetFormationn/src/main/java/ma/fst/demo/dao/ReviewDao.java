package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.Client;
import ma.fst.demo.bean.Professeur;
import ma.fst.demo.bean.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review, Long> {

//	public void findByProfandClient(Professeur prof, Client client);
}
