import java.util.Arrays;

public class GameActions {

    String [][] coordinates = new String[8][8];

    String [] field = new String[9];

    public String[][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int y, int x, String pawn) {
        this.coordinates[y][x] = pawn;
    }

    public String[] getField() {
        return field;
    }

    public void setField(String[] field) {
        this.field = field;
    }

    public void gameStart(){
       // coordinates[0][0] = "BR";
        //coordinates[0][1] = "BH";
        //coordinates[0][2] = "BB";
        //coordinates[0][3] = "BQ";
        //coordinates[0][4] = "BK";
        //coordinates[0][5] = "BB";
        //coordinates[0][6] = "BH";
       // coordinates[0][7] = "BR";
       // coordinates[7][0] = "WR";
       // coordinates[7][1] = "WH";
       // coordinates[7][2] = "WB";
       // coordinates[7][3] = "WQ";
       // coordinates[7][4] = "WK";
        //coordinates[7][5] = "WB";
       // coordinates[7][6] = "WH";
        //coordinates[7][7] = "WR";

        for (int i = 0; i < 7; i++) {
            if (i == 1){
                for (int j = 0; j < 8; j++) {
                    coordinates[i][j] = "BS";
                }
            }
            if (i == 6){
                for (int j = 0; j < 8; j++) {
                    coordinates[i][j] = "WS";
                }
            }
           // System.out.println(Arrays.deepToString(coordinates));
        }






        //Bishop whiteBishopOne = new Bishop(0, 2, "white");
        //coordinates[0][2] = whiteBishopOne;
        //Bishop whiteBishopTwo = new Bishop(0, 5, "white");
        //coordinates[0][5] = whiteBishopTwo;
        //Bishop blackBishopOne = new Bishop(7, 2, "black");
        //coordinates[7][2] = blackBishopOne;
        //Bishop blackBishopTwo = new Bishop(7, 5, "black");
        //coordinates[7][5] = blackBishopTwo;

        //Rook whiteRookOne = new Rook(0, 0, "white");
        //coordinates[0][0] = whiteRookOne;
        //Rook whiteRookTwo = new Rook(0, 7, "white");
        //coordinates[0][7] = whiteRookTwo;
        //Rook blackRookOne = new Rook(7, 0, "black");
        //coordinates[7][0] = blackRookOne;
        //Rook blackRookTwo = new Rook(7, 7, "black");
        //coordinates[7][7] = blackRookTwo;

        //Knight whiteKnightOne = new Knight(0, 1, "white");
        //coordinates[0][1] = whiteKnightOne;
        //Knight whiteKnightTwo = new Knight(0, 6, "white");
        //coordinates[0][6] = whiteKnightTwo;
        //Knight blackKnightOne = new Knight(7, 1, "black");
        //coordinates[7][1] = blackKnightOne;
        //Knight blackKnightTwo = new Knight(7, 6, "black");
        //coordinates[7][6] = blackKnightTwo;

        //King whiteKing = new King(0, 4, "white");
        //coordinates[0][4] = whiteKing;
        //King blackKing = new King(7, 4, "white");
        //coordinates[7][4] = blackKing;
        //Queen whiteQueen = new Queen(0, 3, "black");
        //coordinates[0][3] = whiteQueen;
        //Queen blackQueen = new Queen(7, 3, "black");
        //coordinates[7][3] = blackQueen;

        //Soldier whiteSoldier1 = new Soldier(1, 0, "white");
        //coordinates[1][0] = whiteSoldier1;
        //Soldier whiteSoldier2 = new Soldier(1, 1, "white");
        //coordinates[1][1] = whiteSoldier2;
        //Soldier whiteSoldier3 = new Soldier(1, 2, "white");
        //coordinates[1][2] = whiteSoldier3;
        //Soldier whiteSoldier4 = new Soldier(1, 3, "white");
        //coordinates[1][3] = whiteSoldier4;
        //Soldier whiteSoldier5 = new Soldier(1, 4, "white");
        //coordinates[1][4] = whiteSoldier5;
        //Soldier whiteSoldier6 = new Soldier(1, 5, "white");
        //coordinates[1][5] = whiteSoldier6;
        //Soldier whiteSoldier7 = new Soldier(1, 6, "white");
        //coordinates[1][6] = whiteSoldier7;
        //Soldier whiteSoldier8 = new Soldier(1, 7, "white");
        //coordinates[1][7] = whiteSoldier8;
        //Soldier blackSoldier1 = new Soldier(6, 0, "black");
        //coordinates[6][0] = blackSoldier1;
        //Soldier blackSoldier2 = new Soldier(6, 1, "black");
        //coordinates[6][1] = blackSoldier2;
        //Soldier blackSoldier3 = new Soldier(6, 2, "black");
        //coordinates[6][2] = blackSoldier3;
        //Soldier blackSoldier4 = new Soldier(6, 3, "black");
        //coordinates[6][3] = blackSoldier4;
        //Soldier blackSoldier5 = new Soldier(6, 4, "black");
        //coordinates[6][4] = blackSoldier5;
        //Soldier blackSoldier6 = new Soldier(6, 5, "black");
        //coordinates[6][5] = blackSoldier6;
        //Soldier blackSoldier7 = new Soldier(6, 6, "black");
        //coordinates[6][6] = blackSoldier7;
        //Soldier blackSoldier8 = new Soldier(6, 7, "black");
        //coordinates[6][7] = blackSoldier8;







    }
    public void gameOver(){

    }
    public void surrender(){}
    public void displayAllPossibleMoves(){}
    public void showBattlefield(){
        field[0]= "__     a        b        c        d        e        f        g        h ";
        System.out.println(field[0]);
        System.out.println();
        for (int i = 1; i < 9; i++) {
            int q = 9 - i;
            String emptyRow = String.format("%d     ____     ____     ____     ____     ____     ____     ____     ____", q);
            StringBuilder adjustedrow = new StringBuilder(emptyRow);

            int a = 0;
            for (int j = 6; j < 71; j+=9) {

                if (coordinates[i-1][a]!=null){
                    adjustedrow.replace(j, j+4, Arrays.deepToString(new String[]{coordinates[i - 1][a]}));
                }
                a++;



            }
            field[i] = String.valueOf(adjustedrow);
            System.out.println(field[i]);
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public void warningQueen(){}
    public  void warningCheck(){}

    public void checkMate(){}
    public void undo(){}

    public void move(int currentNumber, char currentLetter, int destinationNum, char destinationLet) {
        coordinates[destinationNum][(int)destinationLet-96] = coordinates[currentNumber][(int)currentLetter-96];
        coordinates[currentNumber][(int)currentLetter-96] = null;
        field[0]= "__     a        b        c        d        e        f        g        h ";
        System.out.println(field[0]);
        System.out.println();
        for (int i = 1; i < 9; i++) {
            int q = 9 - i;
            String emptyRow = String.format("%d     ____     ____     ____     ____     ____     ____     ____     ____", q);
            StringBuilder adjustedrow = new StringBuilder(emptyRow);

            int a = 0;
            for (int j = 6; j < 71; j+=9) {

                if (coordinates[i-1][a]!=null){
                    adjustedrow.replace(j, j+4, Arrays.deepToString(new String[]{coordinates[i - 1][a]}));
                }
                a++;



            }
            field[i] = String.valueOf(adjustedrow);
            System.out.println(field[i]);
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }











}
