package Exercicios;

import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;

import ValueObject.*;
import Exibir.*;
import IO.DesserializarArquivo;

public class Exercicio03 {

	public Exercicio03(List<ChamadosVO> listaChamados, List<LancamentosVO> listaLancamentos, List<StatusVO> listaStatus, Scanner scanner) throws Exception {

		System.out.println("Por favor, informe o nome do arquivo a ser carregado:");
		String nomeArquivo = scanner.next();

		ObjectInputStream objIS = DesserializarArquivo.DesserializarArquivo(nomeArquivo);

		ChamadosVO obj = (ChamadosVO)objIS.readObject();
		objIS.close();

		int chamadoID = obj.chamadoID;
		
		Chamados.ExibirChamados(listaChamados, chamadoID);
		Lancamentos.ExibirLancamentos(listaLancamentos, listaStatus, chamadoID);
		
	}

}