package entities;

import abstractentities.Unit;
import enums.AttackTypeEnum;
import enums.UnitClassEnum;

public class UnitWarrior extends Unit {

    public UnitWarrior(int row, int col) {
        super(
                UnitClassEnum.WARRIOR,
                AttackTypeEnum.SLASH,
                "W",
                "Warrior",
                row,
                col,
                15,
                15,
                20,
                1,
                1,
                false);
    }
}
