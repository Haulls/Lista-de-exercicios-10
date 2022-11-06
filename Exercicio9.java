package Lista10;

public class Exercicio9 {

	public static void main(String[] args) {
		int antecessor =1;
		int sucessor = 1;
		int contadora = 1;
		int aux;
		
		do {
			System.out.println(antecessor+ "");
			aux = antecessor + sucessor;
			antecessor = sucessor;
			sucessor = aux;
			
			contadora++;
			
			
			
		} while (contadora <=15);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
