package exemploBuilder;

public class MainClass {
	public static void main(String[] args) {
		CasaBuilder builder = new CasaBuilder();
		Casa casa = builder.addComodo(new Comodo("sala", 200, 200))
						   .addComodo(new Comodo("cozinha", 300, 300))
						   .addComodo(new Comodo("suite master", 130, 200))
						   .setPiscina(new Piscina(400,800,130))
						   .build();
		System.out.println(casa);
	}

}
