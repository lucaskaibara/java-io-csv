package DAL;

import java.io.BufferedReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import ValueObject.ChamadosVO;
import IO.LeitorArquivo;

public class ChamadosDAL {

	public List<ChamadosVO> chamadosDAL() throws Exception {
		
		BufferedReader br = LeitorArquivo.LeitorArquivo("src/Dados/Chamados.csv");

		br.readLine();
		String linha = br.readLine();

		String[] dados;

		List<ChamadosVO> listaChamados = new ArrayList<ChamadosVO>();

		while (linha != null) {
			dados = linha.split(";");

			ChamadosVO obj = new ChamadosVO();
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

			obj.chamadoID = Integer.parseInt(dados[0]);
			obj.descricao = dados[1];
			obj.dataAbertura = df.parse(dados[2]);
			obj.custo = Double.parseDouble(dados[3]);

			listaChamados.add(obj);

			linha = br.readLine();
		}

		br.close();

		return listaChamados;

	}
	
}