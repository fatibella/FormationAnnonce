package ma.fst.demo.bean;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnnonceModule implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date duree;
	private Date heureDebut;
	private Date heureFin;

	@ManyToOne
	private AnnonceFormation annonceFormation;

	@ManyToOne
	private Module module;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AnnonceFormation getAnnonceFormation() {
		return annonceFormation;
	}

	public void setAnnonceFormation(AnnonceFormation annonceFormation) {
		this.annonceFormation = annonceFormation;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Date getDuree() {
		return duree;
	}

	public void setDuree(Date duree) {
		this.duree = duree;
	}

	public Date getheureDebut() {
		return heureDebut;
	}

	public void setheureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getheureFin() {
		return heureFin;
	}

	public void setheureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	public AnnonceModule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnnonceModule(Long id, Date duree, Date heureDebut, Date heureFin, AnnonceFormation annonceFormation,
			Module module) {
		super();
		this.id = id;
		this.duree = duree;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.annonceFormation = annonceFormation;
		this.module = module;
	}

	@Override
	public String toString() {
		return "AnnonceModule [id=" + id + ", duree=" + duree + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin
				+ ", annonceFormation=" + annonceFormation + ", module=" + module + "]";
	}

}
