package players;

import abstractentities.Unit;

import java.util.ArrayList;

public class Player {

    private ArrayList<Unit> unitCollection;

    public Player() {
        this.unitCollection = new ArrayList<>();
    }

    public void add(Unit gameUnit) {
        this.unitCollection.add(gameUnit);
    }

    public ArrayList<Unit> getUnitCollection() {
        return this.unitCollection;
    }
}
