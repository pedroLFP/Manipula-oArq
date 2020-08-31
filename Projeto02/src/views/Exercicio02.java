package views;

import dao.ViagemDao;
import model.Viagem;

public class Exercicio02 {


	
	private static ViagemDao nd = new ViagemDao();
	
	public static void main(String[] args) {
	
		
		
		for(Viagem n: nd.openEntrada()) {
			
			System.out.println(n.toString());
			
		}
		
		nd.saveSaida(nd.openEntrada());
	}

}
