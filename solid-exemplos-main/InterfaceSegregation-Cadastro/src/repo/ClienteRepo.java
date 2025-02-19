package repo;

import java.util.List;

import dao.Creatable;
import dao.Updatable;
import model.Cliente;

public class ClienteRepo implements Creatable<Cliente>,
								    dao.Readable<Cliente, Integer>,
								    Updatable<Cliente>{

	@Override
	public Cliente update(Cliente object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente create(Cliente objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
