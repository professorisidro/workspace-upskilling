package generator;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import core.RegistroVendas;

public class GeradorRelatorios {

	protected List<RegistroVendas> lista;

	public GeradorRelatorios(List<RegistroVendas> lista) {
		super();
		this.lista = lista;
	}
	
	public void gerarRelatorio() {
		try {
			File f = new File("relatorio.txt");
			FileWriter fw = new FileWriter(f);
			PrintWriter pr = new PrintWriter(fw);
			for (RegistroVendas r: lista) {
				pr.println(r.getData()+ ";"+r.getDescricao()+";"+r.getValor());
			}			
			pr.close();
			fw.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
}
