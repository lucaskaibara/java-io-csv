package Exibir;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import ValueObject.ChamadosVO;

public class Chamados {

	public static void ExibirChamados(List<ChamadosVO> listaChamados, int chamadoID) throws Exception {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		for (ChamadosVO x : listaChamados) {
			if (x.chamadoID == chamadoID) {
				System.out.println(
					"Id: " + x.chamadoID + "\n" +
					"Descrição: " + x.descricao + "\n" +
					"Data de abertura: " + df.format(x.dataAbertura) + "\n" +
					"Custo: " + x.custo + "\n"
				);
			}
		}

	}

}