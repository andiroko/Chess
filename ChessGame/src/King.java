import java.util.Arrays;

public class King extends GameActions implements PawnGeneralActions{





    @Override
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

    }


}
