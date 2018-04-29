package Exercicios;

import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

import ValueObject.ChamadosVO;
import IO.SerializarArquivo;

public class Exercicio02 {
	
	public Exercicio02(List<ChamadosVO> listaChamados, Scanner scanner) throws Exception {
		
		System.out.println("Por favor, informe o id do chamado:");
		int chamadoID = scanner.nextInt();
		
		System.out.println("Por favor, informe o nome do arquivo a ser salvo:");
		String nomeArquivo = scanner.next();
		
		ObjectOutputStream objOS = SerializarArquivo.SerializarArquivo(nomeArquivo);
		
		ChamadosVO obj = new ChamadosVO();
		
		for (ChamadosVO x : listaChamados) {
			if (x.chamadoID == chamadoID) {
				obj.chamadoID = x.chamadoID;
				obj.descricao = x.descricao;
				obj.dataAbertura = x.dataAbertura;
				obj.custo = x.custo;
			}
		}
		
		objOS.writeObject(obj);
		objOS.close();
		
		System.out.println("Arquivo salvo com sucesso!");
		
	}

}