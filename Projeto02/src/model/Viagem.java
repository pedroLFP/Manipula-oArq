package model;

public class Viagem {
	
	private String origem, destino;
	private float distancia, velocidade;
	
	
	
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public String toString() {
		
		return origem + "\t" + destino + "\t" + distancia + "\t" + velocidade +"\t" + getTempo() +"\r\n";
	}
	
	public String toTXT() {
		
		return "Origem: " + origem + " Destino: "  + destino + " tempo: "+ getTempo() + " Horas"+ "\r\n";
	}
	
	public float getTempo() {
		
		return (distancia/velocidade);
	}
	
	
	
}
