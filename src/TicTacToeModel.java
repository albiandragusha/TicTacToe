public class TicTacToeModel {
    private char[][] ticTable = new char[3][3];

    public void playPlayer1(int row, int column) {
        if (ticTable[row][column] != 'O' || ticTable[row][column] != 'X') {
            ticTable[row][column] = 'X';
        } else {
            System.out.println("Pozita është e nxënë");
            playPlayer1(row, column);
        }
    }
    public void playPlayer2(int row, int column) {
        if (ticTable[row][column] != 'O' || ticTable[row][column] != 'X') {
            ticTable[row][column] = 'O';
        } else {
            System.out.println("Pozita është e nxënë");
            playPlayer2(row, column);
        }
    }

    public char[][] getTicTable() {
        return ticTable;
    }
}