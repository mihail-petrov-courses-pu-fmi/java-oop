package entities;

import abstractentities.Unit;
import enums.AttackTypeEnum;
import enums.UnitClassEnum;

public class UnitPriest extends Unit {

    public UnitPriest() {
        super(
                UnitClassEnum.PRIEST,
                AttackTypeEnum.NONE,
                5,
                5,
                0,
                7,
                3,
                true);
    }
}
