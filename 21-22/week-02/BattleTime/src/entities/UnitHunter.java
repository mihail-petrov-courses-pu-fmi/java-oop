package entities;

import abstractentities.Unit;
import enums.AttackTypeEnum;
import enums.UnitClassEnum;

public class UnitHunter extends Unit {

    public UnitHunter() {

        super(UnitClassEnum.HUNTER,
                AttackTypeEnum.RANGE,
                "H",
                "Hunter",
                10,
                10,
                10,
                5,
                2,
                false);
    }
}
