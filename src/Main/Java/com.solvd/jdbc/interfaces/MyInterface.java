package jdbc.interfaces;

import java.util.List;

public interface MyInterface <T>{
	public boolean create(T t);
	public boolean delete(Object ob);
	public boolean update(T t);

	//Using GENERICS
	public T read(Object ob);
	public List<T> readAll();
}
