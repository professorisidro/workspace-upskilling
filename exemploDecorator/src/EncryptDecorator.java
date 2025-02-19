
public class EncryptDecorator implements DataSource{
	
	private DataSource dataSource;
	
	public EncryptDecorator(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void gravar(String dados) {
		// primeiro vou criptografar os dados
		String novoDado = new StringBuilder(dados).reverse().toString();
		dataSource.gravar(novoDado);
		
	}

	@Override
	public String ler() {
		// TODO Auto-generated method stub
		String novaString = new StringBuilder(dataSource.ler()).reverse().toString();
		return novaString;
	}

}
