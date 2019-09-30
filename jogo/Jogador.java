package jogo;


public class Jogador {
	
	private String nome;
	private int numeroVitoria = 0;
	private char marcador;

	private static int numeroEmpates = 0;
	
	public Jogador(char marcador, String nome) {
		this.marcador = marcador;
		this.nome = nome;
	}
	
	public int getNumeroVitoria() {
		return numeroVitoria;
	}

	public void setNumeroVitoria() {
		this.numeroVitoria += 1;
	}

	public char getMarcador() {
		return marcador;
	}

	public static int getNumeroEmpates() {
		return numeroEmpates;
	}

	public static void setNumeroEmpates() {
		Jogador.numeroEmpates += 1;
	}

	public String getNome() {
		return nome;
	}
}
