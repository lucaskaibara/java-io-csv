package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarArquivo {
	
	public static ObjectOutputStream SerializarArquivo(String nomeArquivo) throws IOException {
		
		FileOutputStream fileOS = new FileOutputStream("src/Objetos Serializados/" + nomeArquivo + ".dat");
		ObjectOutputStream objOS = new ObjectOutputStream(fileOS);
		
		return objOS;
		
	}

}