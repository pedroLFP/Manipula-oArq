package views;

import dao.DadosDao;
import model.Dados;

public class Exercicio03 {


	
	private static DadosDao nd = new DadosDao();
	
	public static void main(String[] args) {
	
		
		
		for(Dados n: nd.openEntrada()) {
			
			System.out.println(n.toString());

		}
		
		nd.saveSaida(nd.openEntrada());
	}

}
