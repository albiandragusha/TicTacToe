import java.util.Scanner;

public class TicTacToeMain {

    private static TicTacToeModel ticTacToeModel = new TicTacToeModel();
    public static void main(String[] args) {
        char[][] ticTable = ticTacToeModel.getTicTable();
        TicTacToe ticTacToe = new TicTacToe();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        TicTacToeView view = new TicTacToeView();

        int i =0;
        while (i <= 9) {
            System.out.println("Luaj lojtari i pare");
            ticTacToeModel.playPlayer1(scanner.nextInt(),scanner.nextInt());
            ticTacToe.Metoda2(ticTable);
            System.out.println();

            System.out.println("Luaj lojtari i dyte");
            ticTacToeModel.playPlayer2(scanner1.nextInt(),scanner1.nextInt());
            view.paint(ticTable);
            i++;
        }
    }
}
