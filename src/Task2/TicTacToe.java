package Task2;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;
	public  TicTacToe() {
        board = new char[3][3];
        resetBoard();
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public boolean checkRows(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }
        return false;
    }
	public boolean checkRows() {
		for (int i = 0; i < 3; i++) {
            if (board[i][0] ==EMPTY && board[i][1] == EMPTY && board[i][2] == EMPTY) {
                return true;
            }
        }
        return false;
	
	}

	public boolean checkColumns() {
		for (int i = 0; i < 3; i++) {
            if (board[0][i] == EMPTY && board[1][i] == EMPTY && board[2][i] == EMPTY) {
                return true;
            }
        }
		return false;
	}

	public boolean checkDiagonals() {
		if (board[0][0] == EMPTY && board[1][1] == EMPTY && board[2][2] == EMPTY) {
            return true;
        }
        if (board[0][2] == EMPTY && board[1][1] == EMPTY && board[2][0] == EMPTY) {
            return true;
        }
		return false;
	}
}
