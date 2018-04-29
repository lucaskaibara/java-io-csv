package Principal;

import java.util.List;
import java.util.Scanner;

import DAL.*;
import ValueObject.*;
import Exercicios.*;

public class Menu {
	
	public void MenuPrincipal() throws Exception {
		
		StatusDAL stDAL = new StatusDAL();
		ChamadosDAL chDAL = new ChamadosDAL();
		LancamentosDAL lmDAL = new LancamentosDAL();
		
		List<StatusVO> listaStatus = stDAL.statusDAL();	
		List<ChamadosVO> listaChamados = chDAL.chamadosDAL();
		List<LancamentosVO> listaLancamentos = lmDAL.lancamentosDAL();
		
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao != 4) {
			System.out.println(
				"Bem-vindo ao Sistema de Consulta de Chamado.\n" + 
				"Digite 1 para consultar.\n" + 
				"Digite 2 para salvar.\n" + 
				"Digite 3 para carregar.\n" + 
				"Digite 4 para sair."
			);
			
			opcao = scanner.nextInt();

			if (opcao == 1) {
				new Exercicio01(listaChamados, listaLancamentos, listaStatus, scanner);
			}
			
			else if (opcao == 2) {
				new Exercicio02(listaChamados, scanner);
			}
			
			else if (opcao == 3) {
				new Exercicio03(listaChamados, listaLancamentos, listaStatus, scanner);
			}
		}
		
		System.out.println("Você saiu da aplicação com sucesso!");
		
		scanner.close();

	}

}