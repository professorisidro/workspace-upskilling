package projectGeneric;

public class MainClass {
	public static void main(String[] args) {
		GenericRepo<Produto, Integer> produtoRepo = new GenericRepo<>();
		GenericRepo<Cliente, String> clienteRepo = new GenericRepo<>();
		
		produtoRepo.save(new Produto(1,"Computador",1500.0));
		produtoRepo.save(new Produto(2,"Mouse", 50.0));
		clienteRepo.save(new Cliente("Isidro","isi@dro.com","11987654321"));
		
		
		Produto p = produtoRepo.findById(2);
		System.out.println(p);
		
		Cliente c = clienteRepo.findById("isi@dro.com");
		System.out.println(c);
		
	}
}
