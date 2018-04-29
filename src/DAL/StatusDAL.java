package DAL;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import IO.LeitorArquivo;
import ValueObject.StatusVO;

public class StatusDAL {

	public List<StatusVO> statusDAL() throws Exception {

		BufferedReader br = LeitorArquivo.LeitorArquivo("src/Dados/Status.csv");

		br.readLine();
		String linha = br.readLine();

		String[] dados;

		List<StatusVO> listaStatus = new ArrayList<StatusVO>();

		while (linha != null) {
			dados = linha.split(";");

			StatusVO obj = new StatusVO();

			obj.statusID = Integer.parseInt(dados[0]);
			obj.descricao = dados[1];

			listaStatus.add(obj);

			linha = br.readLine();
		}

		br.close();

		return listaStatus;

	}

}