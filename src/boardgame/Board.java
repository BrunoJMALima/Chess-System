package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece [][] pieces;
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int linha, int coluna) {
		if (!positionExists(linha, coluna)) {
			throw new BoardException("Positions not on the board");
		}
		return pieces[linha] [coluna];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Positions not on the board");
		}
		return pieces[position.getLinha()] [position.getColuna()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		
		pieces[position.getLinha()][position.getColuna()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int linha, int coluna) {
		return linha >= 0 && linha < rows && coluna >= 0 && coluna < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getLinha(), position.getColuna());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Positions not on the board");
		}
		return piece(position) != null;
	}
}
