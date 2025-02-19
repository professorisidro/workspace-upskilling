package projectGeneric;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class GenericRepo<C, ID> {

	private ArrayList<C> database;

	public GenericRepo() {
		this.database = new ArrayList<C>();
	}

	public C save(C object) {
		this.database.add(object);
		return object;
	}

	public ArrayList<C> findAll() {
		return this.database;
	}

	public C findById(ID key) {
		return this.database.stream().filter(e -> compareValue(e, key)).findFirst().orElse(null);
	}

	public Field getIdFieldFromObject(C element) {
		try {
			for (Field f : element.getClass().getDeclaredFields()) {
			    System.out.println(f.getName());
				for (Annotation an : f.getDeclaredAnnotations()) {
					if (an.annotationType().getName().contains("MyId")) {
						System.out.println("Encontrei o atributo " + f.getName() + " anotado com MyId");
						return f;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public boolean compareValue(C element, ID key) {
		try {
			Field f = getIdFieldFromObject(element);
			if (f != null) {
				f.setAccessible(true);
				return f.get(element).equals(key);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
