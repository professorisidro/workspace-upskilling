package core;

public class FuncionarioFactory {
	
	public Funcionario createChefe(int num, String nome, double sal, double adFunc, double bt) {
		return new Chefe(num, nome, sal, adFunc, bt);
	}	
	public Funcionario createComissionado(int num, String nome, double sal, double com) { 
		return new Comissionado(num, nome, sal, com);
	}
	public Funcionario createHorista(int num, String nome, int numHoras, double valHoras) {
		return new Horista(num, nome, numHoras, valHoras);
	}
	public Funcionario createEmpreiteiro(int num, String nome, double empr) {
		return new Empreiteiro(num, nome, empr);
	}

}
