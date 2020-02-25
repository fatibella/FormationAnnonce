package ma.fst.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fst.demo.bean.Client;
import ma.fst.demo.dao.ClientDao;
import ma.fst.demo.model.facade.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;

	@Override
	public void save(Client client) {

		clientDao.save(client);
	}

	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}

	@Override
	public Client findByCin(String cin) {

		return clientDao.findByCin(cin);
	}

	@Override
	public int note() {
		// TODO Auto-generated method stub
		return 0;
	}

}
