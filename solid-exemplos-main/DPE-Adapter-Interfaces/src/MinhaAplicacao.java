import java.util.Scanner;

public class MinhaAplicacao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println("Digite o codigo");	
		p.setId(Integer.parseInt(teclado.nextLine()));
		System.out.println("Digite o nome");
		p.setNome(teclado.nextLine());
		System.out.println("Digite o preco");
		p.setPreco(Double.parseDouble(teclado.nextLine()));
		
		ServicoAdapter adapter = new ServicoAdapter();
		adapter.adaptarServico(p);
		
	}
}

