package exemploSingleton;

public class Main {
	public static void main(String[] args) {
		ClasseDeServico c1 = new ClasseDeServico();
		c1.executaAlgo();
		
		ClasseDeServico c2 = new ClasseDeServico();
		c2.executaAlgo();
	}

}
