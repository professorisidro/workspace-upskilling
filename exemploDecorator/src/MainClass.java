
public class MainClass {
	public static void main(String[] args) {
		
		DataSource ds = new CompactDecorator(new EncryptDecorator(new FileDataSource("teste.txt")));
		ds.gravar("p1 p2 p3");
		
		
		System.out.println(ds.ler());
		
		
	}
}
