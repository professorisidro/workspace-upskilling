package factory;

import core.Moto;
import core.Veiculo;

public class FabricaDeMotos extends FabricaDeVeiculos {

	@Override
	public Veiculo criarVeiculo() {
		// TODO Auto-generated method stub
		return new Moto("SRAD", 80000, 1000);
	}

}
