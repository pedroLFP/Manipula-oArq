package model;

public class Notas {
	
	private String alunos;
	private float nota1, nota2, nota3;
	
	
	public String getAlunos() {
		return alunos;
	}
	public void setAlunos(String alunos) {
		this.alunos = alunos;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getNota3() {
		return nota3;
	}
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	
	public String toString() {
		
		return alunos + "\t" + nota1 + "\t" + nota2 + "\t" + nota3 +"\t" + getMedia() +"\r\n";
	}
	
	public String toTXT() {
		
		return alunos + " media "  + getMedia() +"\r\n";
	}
	
	public int getMedia() {
		
		return (int)((nota1 + nota2 + nota3)/3);
	}
	
	
	
}
