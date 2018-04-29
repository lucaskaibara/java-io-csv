package Exercicios;

import java.util.List;
import java.util.Scanner;

import ValueObject.*;
import Exibir.*;

public class Exercicio01 {
	
	public Exercicio01(List<ChamadosVO> listaChamados, List<LancamentosVO> listaLancamentos, List<StatusVO> listaStatus, Scanner scanner) throws Exception {
		
		System.out.println("Por favor, informe o id do chamado:");
		int chamadoID = scanner.nextInt();

		Chamados.ExibirChamados(listaChamados, chamadoID);
		Lancamentos.ExibirLancamentos(listaLancamentos, listaStatus, chamadoID);
		
	}

}