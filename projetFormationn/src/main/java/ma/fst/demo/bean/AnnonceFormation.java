package ma.fst.demo.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AnnonceFormation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateDebut;
	private Date dateFin;
	private double prix;
	private String reference;

	@OneToMany(mappedBy = "annonceFormation")
	private List<Client> clients;

	@OneToMany(mappedBy = "annonceFormation")
	private List<Filliere> filliers;

	@OneToMany(mappedBy = "annonceFormation")
	private List<Review> reviews;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getdateDebut() {
		return dateDebut;
	}

	public void setdateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getdateFin() {
		return dateFin;
	}

	public void setdateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Filliere> getFilliers() {
		return filliers;
	}

	public void setFilliers(List<Filliere> filliers) {
		this.filliers = filliers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AnnonceFormation(Long id, Date dateDebut, Date dateFin, double prix, List<Client> clients,
			List<Filliere> filliers) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
		this.clients = clients;
		this.filliers = filliers;
	}

	public AnnonceFormation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnnonceFormation [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", prix=" + prix
				+ "]";
	}

}
