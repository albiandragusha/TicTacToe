public class TicTacToe
{
    public static void Metoda2(char[][] ticTable)
    {   boolean answer=false;
        for(int i=0;i<ticTable.length;i++) //Rreshtat
        {
            if(ticTable[i][0]=='X'&&ticTable[i][1]=='X'&&ticTable[i][2]=='X'|| ticTable[i][0]=='O'&&ticTable[i][1]=='O'&&ticTable[i][2]=='O')
            {
                answer=true;

            }
            if(answer)
            {
                System.out.println("Ka Fituar: " +ticTable[i][0]);
                System.exit(0);
            }

        }
        for(int i=0;i<ticTable.length;i++) //Shtyllat
        {
            if(ticTable[0][i]=='X'&&ticTable[1][i]=='X'&&ticTable[2][i]=='X'|| ticTable[0][i]=='O'&&ticTable[1][i]=='O'&&ticTable[2][i]=='O')
            {
                answer=true;
            }
            if(answer)
            {
                System.out.println("Ka Fituar: " +ticTable[0][i]);
                System.exit(0);
            }
        }
        int countX=0;
        int countO=0;
        for(int i=0;i<ticTable.length;i++) //Diagonale
        {

            if(ticTable[i][i]=='X')
            {
                countX++;
            }
            if(countX==3)
            {answer=true;}

            if(ticTable[i][i]=='O')
            {
                countO++;
            }
            if(countX==3 || countO==3)
            {answer=true;}
            if(answer)
            {
                System.out.println("Ka Fituar: " +ticTable[i][i]);
                System.exit(0);
            }

        }
        //Diagonale

        if(ticTable[2][0]=='X'&&ticTable[1][1]=='X'&&ticTable[0][2]=='X'|| ticTable[2][0]=='O'&&ticTable[1][1]=='O'&&ticTable[0][2]=='O')
        {
            answer=true;
            if(answer)
            {
                System.out.println("Ka Fituar: " +ticTable[2][0]);
                System.exit(0);
            }
        }
        int counter=0;
        for(int i=0;i<ticTable.length;i++)
        {
            for(int j=0;j<ticTable.length;j++)
            {
                if(ticTable[i][j]=='X' || ticTable[i][j]=='O')
                {
                    counter++;
                }
            }
            if(counter==9)
            {
                System.out.println("Ka ndodhur nje barazim");
                System.exit(0);
            }
        }

    }
}
