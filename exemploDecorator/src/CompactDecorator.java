
public class CompactDecorator implements DataSource{
	
	private DataSource dataSource;
	
	public CompactDecorator(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void gravar(String dados) {
		String novoDado = dados.replaceAll(" ", ";");
		dataSource.gravar(novoDado);
		
	}

	@Override
	public String ler() {
		String novoDado = dataSource.ler().replaceAll(";", " ");
		return novoDado;
	}

}
