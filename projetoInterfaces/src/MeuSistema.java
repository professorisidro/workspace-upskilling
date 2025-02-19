
public class MeuSistema {
	public static void main(String[] args) {
		InterfaceBD ibd = new BDOracle();

		ibd.conectar();
		ibd.executar("Select * from tbl_cliente");
		ibd.desconectar();

		Executor e = (String comando) -> {
			System.out.println("Executando o comando x = " + comando);
		};

		e.executar("abcd");
	}

}
