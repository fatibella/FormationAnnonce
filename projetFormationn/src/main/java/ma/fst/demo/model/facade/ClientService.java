package ma.fst.demo.model.facade;

import java.util.List;

import ma.fst.demo.bean.Client;

public interface ClientService {

	public Client findByCin(String cin);

	public void save(Client client);

	public List<Client> findAll();

}
