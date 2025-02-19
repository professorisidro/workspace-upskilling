import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDataSource implements DataSource {
	private String filename;
	
	public FileDataSource(String filename) {
		this.filename = filename;
	}

	@Override
	public void gravar(String dados) {
		try {
			FileWriter fw = new FileWriter(new File(this.filename));
			PrintWriter pw = new PrintWriter(fw);
			pw.println(dados);
			pw.close();
			fw.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}		
	}

	@Override
	public String ler() {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader(new File(this.filename));
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			br.close();
			fr.close();
			return str;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
