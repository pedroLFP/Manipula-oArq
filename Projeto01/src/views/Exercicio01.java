package views;

import dao.NotasDao;
import model.Notas;

public class Exercicio01 {


	
	private static NotasDao nd = new NotasDao();
	
	public static void main(String[] args) {
	
		
		
		for(Notas n: nd.openEntrada()) {
			
			System.out.println(n.toString());
			
		}
		
		nd.saveSaida(nd.openEntrada());
	}

}
