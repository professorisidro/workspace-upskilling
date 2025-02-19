package exemploSingleton;

public class ContadorGlobal {
	
	private int count;
	
	private static ContadorGlobal instance;
	
	private ContadorGlobal() {
		this.count = 0;
	}
	
	public static ContadorGlobal getInstance() {
		if (instance == null) {
			instance = new ContadorGlobal();
		}
		return instance;
	}
	
	public void inc() {
		count++;
	}
	public int getCount() {
		return count;
	}

}
