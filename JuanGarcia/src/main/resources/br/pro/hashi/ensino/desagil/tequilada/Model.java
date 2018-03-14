package br.pro.hashi.ensino.desagil.tequilada;

public class Model {
	private Board board;
	private CpuPlayer cpuPlayer;
	private HumanPlayer humanPlayer;
	private Target target;
	private String winner;

	public Model() {
		board = new Board("board.txt");

		cpuPlayer = new CpuPlayer(board.getNumRows() - 1, board.getNumCols() - 1, board);
		humanPlayer = new HumanPlayer(0, 0);

		target = new Target(4, 14);
	}

	public void update() {

		cpuPlayer.move();
		if ((cpuPlayer.getRow()==4 && cpuPlayer.getCol()==14)){
			this.setWinner("CPU PLAYER WON");
		}
		if (humanPlayer.getRow()==4 && humanPlayer.getCol()==14) {
			this.setWinner("HUMAN PLAYER WON");
		}
	}

	public Board getBoard() {
		return board;
	}
	public Player getCpuPlayer() {
		return cpuPlayer;
	}
	public Player getHumanPlayer() {
		return humanPlayer;
	}
	public Target getTarget() {
		return target;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
}