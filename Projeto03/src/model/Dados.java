package model;

public class Dados {
	
	private String pais;
	private int confirmados, recuperados, mortes;
	
	

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
		
		return pais + "\t "  + (recuperados/confirmados) + "% \t"+ (mortes/confirmados) + "% \t"+ "\r\n";
	}
	
	
	
	
}
