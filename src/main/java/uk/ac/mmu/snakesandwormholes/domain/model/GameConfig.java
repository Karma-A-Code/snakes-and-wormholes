package uk.ac.mmu.snakesandwormholes.domain.model;

public class GameConfig {

    private final int boardRows;
    private final int boardColumns;
    private final int numberOfDice;
    private final int numberOfPlayers;

    public GameConfig(int boardRows, int boardColumns, int numberOfDice, int numberOfPlayers) {
        this.boardRows = boardRows;
        this.boardColumns = boardColumns;
        this.numberOfDice = numberOfDice;
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getBoardRows() {
        return boardRows;
    }

    public int getBoardColumns() {
        return boardColumns;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
}
