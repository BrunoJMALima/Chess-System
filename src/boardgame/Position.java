package boardgame;

// Classe Position da camada de BoardGame que representa a posição no tabuleiro//

public class Position {

	private int linha;
	private int coluna;

	// Criação dos construtores//
	
	public Position(int linha, int coluna) {

		this.linha = linha;
		this.coluna = coluna;
	}

	// Criação dos Getter e Setters//
	
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	// Criação do ToString para imprimir a posição na tela//
	
	@Override
	public String toString() {
		return linha + " , " + coluna;
	}
}
