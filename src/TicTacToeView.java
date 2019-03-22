public class TicTacToeView {

    public static void paint(char[][] ticTable){
        for (int i =0;i<ticTable.length;i++){
            for (int j = 0;j<ticTable[i].length;j++){
                System.out.print("|"+ticTable[i][j]+"| ");
            }
            System.out.println();
        }
    }
}