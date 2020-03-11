package ma.fst.demo.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String cin;

	private Paiement paimment;

	@ManyToOne
	private Professeur prof;

	@ManyToOne
	private AnnonceFormation annonceFormation;

	private Review review;

	public Professeur getProf() {
		return prof;
	}

	public void setProf(Professeur prof) {
		this.prof = prof;
	}

	public AnnonceFormation getAnnonceFormation() {
		return annonceFormation;
	}

	public void setAnnonceFormation(AnnonceFormation annonceFormation) {
		this.annonceFormation = annonceFormation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Paiement getPaimment() {
		return paimment;
	}

	public void setPaimment(Paiement paimment) {
		this.paimment = paimment;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Client(Long id, String nom, String prenom, String cin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
