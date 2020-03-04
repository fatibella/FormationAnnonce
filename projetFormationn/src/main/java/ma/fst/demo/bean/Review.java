package ma.fst.demo.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int point;
	private String commentaire;

	@ManyToOne
	private AnnonceFormation annonceFormation;

	private Client client;

	@ManyToOne
	private Professeur prof;

	public Long getId() {
		return id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public AnnonceFormation getAnnonceFormation() {
		return annonceFormation;
	}

	public void setAnnonceFormation(AnnonceFormation annonceFormation) {
		this.annonceFormation = annonceFormation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(Long id, int point, String commentaire, AnnonceFormation annonceFormation, Client client) {
		super();
		this.id = id;
		this.point = point;
		this.commentaire = commentaire;
		this.annonceFormation = annonceFormation;
		this.client = client;
	}

}
