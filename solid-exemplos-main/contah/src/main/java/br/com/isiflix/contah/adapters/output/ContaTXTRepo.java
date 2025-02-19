package br.com.isiflix.contah.adapters.output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class ContaTXTRepo {
	
	private static final String FILENAME="contas.txt";
	
	public void persistContaInFile(ContaTXTRecord conta) {
		try {
			File f = new File(FILENAME);
			FileWriter fw = new FileWriter(FILENAME, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(conta);
			pw.close();
			fw.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	
	public List<ContaTXTRecord> readAllFromFile(){
		try {
			File f =  new File(FILENAME);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			List<ContaTXTRecord> lista = new ArrayList<ContaTXTRecord>();
			String linha;
			while ((linha = br.readLine()) != null) {
				ContaTXTRecord rec = new ContaTXTRecord();
				String campos[] = linha.split(";");
				rec.setTxtNumeroConta(Integer.parseInt(campos[0]));
				rec.setTxtCpfTitular(campos[1]);
				rec.setTxtNomeTitular(campos[2]);
				rec.setTxtSaldo(Double.parseDouble(campos[3]));
				lista.add(rec);
			}					
			br.close();
			fr.close();
			return lista;
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
