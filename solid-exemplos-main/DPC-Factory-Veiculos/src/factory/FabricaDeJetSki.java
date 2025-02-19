package factory;

import core.JetSki;
import core.Veiculo;

public class FabricaDeJetSki extends FabricaDeVeiculos{

	@Override
	public Veiculo criarVeiculo() {
		// TODO Auto-generated method stub
		return new JetSki("XYZ-Plus3", 120000, "Family");
	}
	

}
