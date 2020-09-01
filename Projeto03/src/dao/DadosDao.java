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
	public int soMortes, x = 0, somaMortes = 0, soConfirmados, somaConfirmados = 0, soRecuperados, somaRecuperados = 0;
	
	public ArrayList<Dados> openEntrada(){
		
		ArrayList<Dados> dados = new ArrayList<>();
		
	
		
		try {
			br = new BufferedReader(new FileReader(entrada));
			String linha = br.readLine();
			
		
			while (linha != null) {
			
				dado = new Dados();
				dado.setPais(linha.split("\t")[0]);
				dado.setConfirmados(Integer.parseInt(linha.split("\t")[1]));
				dado.setRecuperados(Integer.parseInt(linha.split("\t")[2]));
				dado.setMortes(Integer.parseInt(linha.split("\t")[3]));
				dados.add(dado);
				
				linha = br.readLine();
			}
			
			for (int i=0; i<dados.size(); i++) {
				dado = dados.get(i);
				
				soConfirmados = (int) dado.getConfirmados();
				soMortes = dado.getMortes();
				soRecuperados = dado.getRecuperados();
				
				
				somaMortes = somaMortes + soMortes;
				somaRecuperados = somaRecuperados + soRecuperados;
				somaConfirmados = somaConfirmados + soConfirmados;
			}

			for (int i=0; i<dados.size(); i++) {
				dado = dados.get(i);

				float recuperados = dado.getRecuperados();
				float porcRecuperados = (recuperados/somaRecuperados)*100;
				
				float confirmados = dado.getConfirmados();
				float porcConfirmados = (confirmados/somaConfirmados)*100;
				
				float mortes = dado.getMortes();
				float porcMortes = (mortes/somaMortes)*100;
				
				dado.setPorcentagem_confirmados(porcConfirmados);
				dado.setPorcentagem_recuperados(porcRecuperados);
				dado.setPorcentagem_mortes(porcMortes);
								
				
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
