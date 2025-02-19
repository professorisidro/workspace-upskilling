package generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import core.RegistroVendas;

public class GeradorHTML extends GeradorRelatorios{
	
	public GeradorHTML(List<RegistroVendas> lista) {
		super(lista);
	}
	
	@Override
	public void gerarRelatorio() {
		try {
			File f = new File("relatorio.html");
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<table>");
			for (RegistroVendas r : super.lista) {
				pw.println("<tr> <td>"+r.getData()+"</td> <td>"+r.getDescricao()+ "</td> <td>"+r.getValor()+"</td></tr>");
			}
			
			
			pw.println("</table>");
			pw.println("</body>");
			pw.println("</html>");
			pw.close();
			fw.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
