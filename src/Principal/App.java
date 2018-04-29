package Principal;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		
		try {
			Menu menu = new Menu();
			
			menu.MenuPrincipal();
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("O arquivo .csv não pode ser carregado.");
		}
		
		catch (Exception e) {
			System.out.println("Houve um erro durante a execução do programa.");
		}
	}

}