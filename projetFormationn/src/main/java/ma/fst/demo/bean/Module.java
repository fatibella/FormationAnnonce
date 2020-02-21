package ma.fst.demo.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Module implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ref;
	private String Libelle;

	@ManyToOne
	private Niveau niveau;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String Libelle) {
		this.Libelle = Libelle;
	}

	public String getref() {
		return ref;
	}

	public void setref(String ref) {
		this.ref = ref;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Module(Long id, String Libelle, String ref) {
		super();
		this.id = id;
		this.Libelle = Libelle;
		this.ref = ref;
	}

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

}
