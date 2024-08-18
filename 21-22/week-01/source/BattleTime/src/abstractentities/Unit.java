package abstractentities;
import enums.UnitClassEnum;
import enums.AttackTypeEnum;

public abstract class Unit {

    protected UnitClassEnum unitClass;
    protected AttackTypeEnum attackType;
    protected int health;
    protected int defence;
    protected int attack;
    protected int rangeIndex;
    protected int moveIndex;
    protected boolean canFly;

    public Unit(
            UnitClassEnum unitClass,
            AttackTypeEnum attackType,
            int health,
            int defence,
            int attack,
            int rangeIndex,
            int moveIndex,
            boolean canFly) {
        this.unitClass  = unitClass;
        this.attackType = attackType;
        this.health     = health;
        this.defence    = defence;
        this.attack     = attack;
        this.rangeIndex = rangeIndex;
        this.moveIndex  = moveIndex;
        this.canFly     = canFly;
    }
}
