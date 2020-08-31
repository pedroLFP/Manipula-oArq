package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Viagem;

public class ViagemDao {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private Viagem viagem;
	private String entrada = ".\\arquivos\\entrada02.txt";
	private String saida = ".\\arquivos\\saida02.txt";
	
	
	public ArrayList<Viagem> openEntrada(){
		
		ArrayList<Viagem> viagens = new ArrayList<>();
		
		try {
			br = new BufferedReader(new FileReader(entrada));
			String linha = br.readLine();
			
			while (linha != null) {
				
				viagem = new Viagem();
				viagem.setOrigem(linha.split(";")[0]);
				viagem.setDistancia(Float.parseFloat(linha.split(";")[1]));
				viagem.setDestino(linha.split(";")[2]);
				viagem.setVelocidade(Float.parseFloat(linha.split(";")[3]));
				viagens.add(viagem);
				
				linha = br.readLine();
			}
		br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return viagens;
	}
	
	
	public void saveSaida(ArrayList<Viagem> viagens) {
		
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for(Viagem n: viagens) {
				
				bw.write(n.toTXT());
				
			}
			bw.close();
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
}
