package ma.fst.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paiement implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal total;
	private Module module;
	private Client client;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paiement(Long id, Module module, Client client) {
		super();
		this.id = id;
		this.module = module;
		this.client = client;
	}

	@Override
	public String toString() {
		return "Paimment [id=" + id + ", module=" + module + ", client=" + client + "]";
	}

}
