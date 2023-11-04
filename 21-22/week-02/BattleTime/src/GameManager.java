import abstractentities.GameObject;
import abstractentities.Teren;
import abstractentities.Unit;
import entities.UnitMage;
import entities.UnitWarrior;
import players.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {

    private GameObject[][] arena;
    private final int ARENA_SIZE = 3;
    private Scanner inputScanner;

    private final String COMMAND_ATTACK = "A";
    private final String COMMAND_MOVE   = "M";

    private Player activePlayer;
    private Unit activeUnit;

    public GameManager() {

        this.inputScanner = new Scanner(System.in);

        this.arena = new GameObject[this.ARENA_SIZE][this.ARENA_SIZE];

        // декларация на бойни единици
        UnitWarrior player1Warrior = new UnitWarrior();
        UnitMage player1Mage = new UnitMage();

        this.arena[0][0] = new Teren();
        this.arena[0][1] = new Teren();
        this.arena[0][2] = new Teren();

        this.arena[1][0] = player1Warrior;
        this.arena[1][1] = new Teren();
        this.arena[1][2] = new Teren();

        this.arena[2][0] = player1Mage;
        this.arena[2][1] = new Teren();
        this.arena[2][2] = new Teren();

        // инициализиране на играчите
        Player player1 = new Player();
        player1.add(player1Warrior);
        player1.add(player1Mage);

        this.setActivePlayer(player1);
    }

    public void start() {

        while(this.isGameOn()) {

            this.renderArena();
            this.initDialog();
        }
    }

    private boolean isGameOn() {
        return true;
    }

    private void setActivePlayer(Player player) {
        this.activePlayer = player;
    }

    private Player getActivePlayer() {
        return this.activePlayer;
    }

    private void setActiveUnit(Unit unit) {
        this.activeUnit = unit;
    }

    private Unit getActiveUnit() {
        return this.activeUnit;
    }

    private void renderArena() {

        for(int i = 0; i < this.ARENA_SIZE; i++ ) {
            for (int j = 0; j < this.ARENA_SIZE; j++) {

                GameObject currentObject = this.arena[i][j];
                System.out.print(currentObject.render() + " ");
            }
            System.out.println();
        }
    }

    private void initDialog() {

        System.out.println("[U] - Изберете единица");
        System.out.println("[E] - Край на хода");

        // Избор на единица
        // > избор на действие
        // Приключване на хода на играча

        System.out.println("Изберете действие:");
        System.out.println("[A] Атака");
        System.out.println("[M] Движение");
        String command = this.inputScanner.nextLine();

        if(command.equals(COMMAND_ATTACK)) {

        }

        if(command.equals(COMMAND_MOVE)) {

        }
    }

    private void renderPlayerUnit(ArrayList<Unit> unitCollection) {

        for(int i = 0; i < unitCollection.size(); i++) {

            Unit gameUnit = unitCollection.get(i);
            System.out.println(i + " - " + gameUnit.dialogRender());
        }
    }

    private void playerUnitDialog() {

        Player player = this.getActivePlayer();
        ArrayList<Unit> unitCollection = player.getUnitCollection();

        while(true) {

            this.renderPlayerUnit(unitCollection);
            int selectedUnitId = this.inputScanner.nextInt();
            if(selectedUnitId >= 0 && selectedUnitId <= unitCollection.size()) {
                this.setActiveUnit(unitCollection.get(selectedUnitId));
                return;
            }
        }
    }
}
