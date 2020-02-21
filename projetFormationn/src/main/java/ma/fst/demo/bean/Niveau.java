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
public class Niveau implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;

	@ManyToOne
	private Filliere filliere;

	@OneToMany(mappedBy = "module")
	private List<Module> modules;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Niveau(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public Niveau(Long id, String libelle, List<Module> modules) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.modules = modules;
	}

}
