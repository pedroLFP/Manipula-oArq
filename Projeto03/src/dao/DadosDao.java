package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Dados;

public class DadosDao {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private Dados dado;
	private String entrada = ".\\arquivos\\entrada03.txt";
	private String saida = ".\\arquivos\\saida03.txt";
	
	
	public ArrayList<Dados> openEntrada(){
		
		ArrayList<Dados> dados = new ArrayList<>();
		
		dado = new Dados();
		
		try {
			br = new BufferedReader(new FileReader(entrada));
			String linha = br.readLine();
			
			
			while (linha != null) {
			
				
				dado.setPais(linha.split("\t")[0]);
				dado.setConfirmados(Integer.parseInt(linha.split("\t")[1]));
				dado.setRecuperados(Integer.parseInt(linha.split("\t")[2]));
				dado.setMortes(Integer.parseInt(linha.split("\t")[3]));
				dados.add(dado);
				
				linha = br.readLine();
				
		
			}
			
			
			
		br.close();
			
		
		
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return dados;
	}
	
	
	public void saveSaida(ArrayList<Dados> dados) {
		
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for(Dados n: dados) {
				
				bw.write(n.toTXT());
				
			}
			bw.close();
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
}
