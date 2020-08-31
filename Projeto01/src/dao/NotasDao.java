package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Notas;

public class NotasDao {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private Notas notas;
	private String entrada = ".\\arquivos\\entrada01.txt";
	private String saida = ".\\arquivos\\saida01.txt";
	
	
	public ArrayList<Notas> openEntrada(){
		
		ArrayList<Notas> nota = new ArrayList<>();
		
		try {
			br = new BufferedReader(new FileReader(entrada));
			String linha = br.readLine();
			
			while (linha != null) {
				
				notas = new Notas();
				notas.setAlunos(linha.split(",")[0]);
				notas.setNota1(Float.parseFloat(linha.split(",")[1]));
				notas.setNota2(Float.parseFloat(linha.split(",")[2]));
				notas.setNota3(Float.parseFloat(linha.split(",")[3]));
				nota.add(notas);
				
				linha = br.readLine();
			}
		br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return nota;
	}
	
	
	public void saveSaida(ArrayList<Notas> nota) {
		
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for(Notas n: nota) {
				
				bw.write(n.toTXT());
				
			}
			bw.close();
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
}
