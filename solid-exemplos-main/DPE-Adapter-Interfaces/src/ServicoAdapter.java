
public class ServicoAdapter {
	private Servico s;
	public ServicoAdapter() {
		s = new Servico();
	}
	
	public void adaptarServico(Produto p) {
		String str = p.getId()+"|"+p.getNome()+"|"+p.getPreco();
		s.realizarServico(str);
	}
}
