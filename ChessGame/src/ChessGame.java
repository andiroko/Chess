public class ChessGame {

    public static void main(String[] args) {
        GameActions game = new GameActions();
        game.setCoordinates(0,0,"BR");
        game.setCoordinates(0,1,"BR");
        game.setCoordinates(0,2,"BR");
        game.setCoordinates(0,3,"BR");
        game.setCoordinates(0,4,"BR");
        game.setCoordinates(0,5,"BR");
        game.setCoordinates(0,6,"BR");
        game.setCoordinates(0,7,"BR");
        game.setCoordinates(7,0,"BR");
        game.setCoordinates(7,1,"BR");
        game.setCoordinates(7,2,"BR");
        game.setCoordinates(7,3,"BR");
        game.setCoordinates(7,4,"BR");
        game.setCoordinates(7,5,"BR");
        game.setCoordinates(7,6,"BR");
        game.setCoordinates(7,7,"BR");


        Soldier soldier = new Soldier();
        Rook rook = new Rook();
        Knight knight = new Knight();
        Bishop bishop = new Bishop();
        Queen queen = new Queen();
        King king = new King();
        game.gameStart();
        game.showBattlefield();
        game.move(2, b, 4, b);


    }
}
