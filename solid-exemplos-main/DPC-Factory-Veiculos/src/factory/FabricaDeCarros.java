package factory;

import core.Carro;
import core.Veiculo;

public class FabricaDeCarros extends FabricaDeVeiculos{

	@Override
	public Veiculo criarVeiculo() {
		// TODO Auto-generated method stub
		return new Carro("Vitara",50000, 5);
	}

}
