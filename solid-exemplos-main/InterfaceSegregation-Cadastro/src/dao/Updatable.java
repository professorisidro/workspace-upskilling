package dao;

public interface Updatable<T> {
	public T update(T object);
}
