package repo;

import java.util.List;

import dao.Creatable;
import model.Pedido;

public class PedidoRepo implements Creatable<Pedido>, 
                                   dao.Readable<Pedido, Integer>{

	@Override
	public Pedido findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido create(Pedido objeto) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
