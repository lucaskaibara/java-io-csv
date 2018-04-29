package IO;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class LeitorArquivo {
	
	public static BufferedReader LeitorArquivo(String diretorio) throws IOException {
		
		FileReader fr = new FileReader(diretorio);
		BufferedReader br = new BufferedReader(fr);
		
		return br;
		
	}

}