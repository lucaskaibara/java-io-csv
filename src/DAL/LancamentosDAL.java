package DAL;

import java.io.BufferedReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import ValueObject.LancamentosVO;
import IO.LeitorArquivo;

public class LancamentosDAL {

	public List<LancamentosVO> lancamentosDAL() throws Exception {
		
		BufferedReader br = LeitorArquivo.LeitorArquivo("src/Dados/Lançamentos.csv");

		br.readLine();
		String linha = br.readLine();

		String[] dados;

		List<LancamentosVO> listaLancamentos = new ArrayList<LancamentosVO>();

		while (linha != null) {
			dados = linha.split(";");

			LancamentosVO obj = new LancamentosVO();
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			
			obj.chamadoID = Integer.parseInt(dados[0]);
			obj.data = df.parse(dados[1]);
			obj.statusID = Integer.parseInt(dados[2]);

			listaLancamentos.add(obj);

			linha = br.readLine();
		}

		br.close();

		return listaLancamentos;

	}
	
}