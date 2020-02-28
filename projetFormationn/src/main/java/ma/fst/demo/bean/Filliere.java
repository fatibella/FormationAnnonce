package ma.fst.demo.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Filliere implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String reference;

	@OneToMany
	private List<Niveau> niveaux;

	@ManyToOne
	private AnnonceFormation annonceFormation;

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

	public List<Niveau> getNiveaux() {
		return niveaux;
	}

	public void setNiveaux(List<Niveau> niveaux) {
		this.niveaux = niveaux;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Filliere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Filliere(Long id, String reference, List<Niveau> niveaux) {
		super();
		this.id = id;
		this.reference = reference;
		this.niveaux = niveaux;
	}

	@Override
	public String toString() {
		return "Filliere [id=" + id + ", reference=" + reference + ", niveaux=" + niveaux + "]";
	}

}
