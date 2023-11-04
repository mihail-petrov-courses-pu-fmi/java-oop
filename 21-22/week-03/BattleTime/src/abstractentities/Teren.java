package abstractentities;

public class Teren extends GameObject {

    public Teren(int row, int col) {
        super(row, col);
        this.makeObjectPassable();
    }

    @Override
    public String render() {
        return ".";
    }
}
