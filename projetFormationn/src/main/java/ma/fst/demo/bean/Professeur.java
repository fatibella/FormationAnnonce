package ma.fst.demo.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professeur implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ref;
	private String nom;
	private String prenom;
	private double salaire;
	
	@OneToMany(mappedBy = "prof")
	private List<Client> clients;

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

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Professeur(Long id, String nom, String prenom, double salaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Professeur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + ", clients="
				+ clients + "]";
	}

}
