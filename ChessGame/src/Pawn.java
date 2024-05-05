public class Pawn {

    Integer coordinateX;
    Integer coordinateY;

    String colour;

    public Pawn() {
    }

    public Pawn(Integer coordinateX, Integer coordinateY, String colour) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.colour = colour;
    }

    public Integer getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Integer getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
