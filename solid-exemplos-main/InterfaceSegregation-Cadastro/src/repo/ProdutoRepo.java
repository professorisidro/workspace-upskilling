package repo;

import java.util.List;

import dao.Creatable;
import dao.Deletable;
import dao.Updatable;
import model.Produto;

public class ProdutoRepo implements Creatable<Produto>,
                                    dao.Readable<Produto, Integer>,
                                    Updatable<Produto>,
                                    Deletable<Integer>{

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto update(Produto object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto create(Produto objeto) {
		// TODO Auto-generated method stub
		return null;
	}
}
