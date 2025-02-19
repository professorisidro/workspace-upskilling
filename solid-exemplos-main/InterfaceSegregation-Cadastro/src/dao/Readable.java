package dao;

import java.util.List;

public interface Readable<T, ID> {
	public T findById(ID id);
	public List<T> findAll();
}
