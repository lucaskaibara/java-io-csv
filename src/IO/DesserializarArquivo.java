package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesserializarArquivo {

	public static ObjectInputStream DesserializarArquivo(String nomeArquivo) throws IOException {
		
		FileInputStream fileIS = new FileInputStream("src/Objetos Serializados/" + nomeArquivo + ".dat");
		ObjectInputStream objIS = new ObjectInputStream(fileIS);
		
		return objIS;
		
	}
	
}