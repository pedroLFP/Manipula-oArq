package model;

import dao.DadosDao;

public class Dados {
	
	private String pais;
	private int confirmados, recuperados, mortes;
	private float porcentagem_confirmados, porcentagem_recuperados, porcentagem_mortes;
	
	public float getPorcentagem_confirmados() {
		return porcentagem_confirmados;
	}

	public void setPorcentagem_confirmados(float porcentagem_confirmados) {
		this.porcentagem_confirmados = porcentagem_confirmados;
	}

	public float getPorcentagem_recuperados() {
		return porcentagem_recuperados;
	}

	public void setPorcentagem_recuperados(float porcentagem_recuperados) {
		this.porcentagem_recuperados = porcentagem_recuperados;
	}

	public float getPorcentagem_mortes() {
		return porcentagem_mortes;
	}

	public void setPorcentagem_mortes(float porcentagem_mortes) {
		this.porcentagem_mortes = porcentagem_mortes;
	}

	public Dados() {
		
	}
	
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
		
		return pais + "\t" + porcentagem_confirmados + "\t" + porcentagem_recuperados + "\t" + porcentagem_mortes +"\t" + "\r\n";
	}
	
	public String toTXT() {
		
		return pais + "\t "  + (porcentagem_confirmados*2) + "%" + "\t"+ (porcentagem_recuperados*2) + "%" +  "\t"+ (porcentagem_mortes*2) + "%" + "\r\n";
	}
	





}

