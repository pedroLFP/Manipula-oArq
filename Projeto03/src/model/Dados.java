package model;

import dao.DadosDao;

public class Dados {
	
	private String pais;
	private int confirmados, recuperados, mortes;
	public DadosDao dd = new DadosDao();

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public float getConfirmados() {
		return confirmados;
	}

	public void setConfirmados(int confirmados) {
		this.confirmados = confirmados;
	}

	public int getRecuperados() {
		return recuperados;
	}

	public void setRecuperados(int recuperados) {
		this.recuperados = recuperados;
	}

	public int getMortes() {
		return mortes;
	}

	public void setMortes(int mortes) {
		this.mortes = mortes;
	}

	public String toString() {
		
		return pais + "\t" + confirmados + "\t" + recuperados + "\t" + mortes +"\t" + "\r\n";
	}
	
	public String toTXT() {
		
		return pais + "\t "  + getConfirmadosP() + "% \t"+ getRecuperadosP() + "% \t"+ getMortesP() + "%" + "\r\n";
	}
	
	
public int getConfirmadosP() {
		
		return (int)((confirmados/dd.somaConfirmados)*100);
	}
	
public int getRecuperadosP() {
	
	return (int)((recuperados/dd.somaRecuperados)*100);
}

public int getMortesP() {
	
	return (int)((mortes/dd.somaMortes)*100);
}




}

