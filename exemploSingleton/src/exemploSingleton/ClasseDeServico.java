package exemploSingleton;

public class ClasseDeServico {

	public void executaAlgo() {
		System.out.println("Estou na classe de Servico");
		ContadorGlobal contador = ContadorGlobal.getInstance();
		System.out.println("Valor atual:"+contador.getCount());
		contador.inc();
		System.out.println("Valor modificado:"+contador.getCount());
	}
}
