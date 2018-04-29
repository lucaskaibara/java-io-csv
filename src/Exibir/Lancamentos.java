package Exibir;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import ValueObject.LancamentosVO;
import ValueObject.StatusVO;

public class Lancamentos {		

	public static void ExibirLancamentos(List<LancamentosVO> listaLancamentos, List<StatusVO> listaStatus, int chamadoID) throws Exception {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		for (LancamentosVO x : listaLancamentos) {
			if (x.chamadoID == chamadoID) {
				System.out.println(
					"-------------Lançamento-------------\n" +
					"Data: " + df.format(x.data)
				);

				for (StatusVO y : listaStatus) {
					if (x.statusID == y.statusID) {
						System.out.println("Status: " + y.descricao);
					}
				}
			}
		}
		
		System.out.println("----------------Fim-----------------");
	}
	
}