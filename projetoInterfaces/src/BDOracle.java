
public class BDOracle implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Starting oracle conectivity service");		
	}

	@Override
	public void desconectar() {
		System.out.println("Stopping oracle conectivity service");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("oradb> "+comando);
		
	}

}
