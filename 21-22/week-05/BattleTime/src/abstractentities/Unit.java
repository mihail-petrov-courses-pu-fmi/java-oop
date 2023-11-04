package abstractentities;
import enums.UnitClassEnum;
import enums.AttackTypeEnum;

public abstract class Unit extends GameObject {

    protected UnitClassEnum unitClass;
    protected AttackTypeEnum attackType;
    protected int health;
    protected int defence;
    protected int attack;
    protected int rangeIndex;
    protected int moveIndex;
    protected boolean canFly;

    // **
    protected String sign;
    protected String longSign;

    public Unit(
            UnitClassEnum unitClass,
            AttackTypeEnum attackType,
            String sign,
            String longSign,
            int row,
            int col,
            int health,
            int defence,
            int attack,
            int rangeIndex,
            int moveIndex,
            boolean canFly) {
        super(row, col);
        this.unitClass  = unitClass;
        this.attackType = attackType;
        this.sign       = sign;
        this.longSign   = longSign;
        this.health     = health;
        this.defence    = defence;
        this.attack     = attack;
        this.rangeIndex = rangeIndex;
        this.moveIndex  = moveIndex;
        this.canFly     = canFly;
    }

    public String render() {
        return this.sign;
    }

    public String dialogRender() {
        return "[" + this.sign + "] - " + this.longSign;
    }

    public void move(int row, int col) {
        this.setRow(row);
        this.setCol(col);
    }

    public void move(GameObject destination) {
        this.move(destination.getRow(), destination.getCol());
    }
}
