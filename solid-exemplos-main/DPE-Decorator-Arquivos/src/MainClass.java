
public class MainClass {
	public static void main(String[] args) {
		
		DataSource ds = new CompactDecorator(new EncryptDecorator(new FileDataSource("teste.txt")));
		//ds.gravar("palavra1 palavra2 palavra3");
		
		System.out.println(ds.ler());
		
		
	}
}
