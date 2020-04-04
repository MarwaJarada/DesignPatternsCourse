package stateDesignPatern.states;

import stateDesignPatern.Player;

public class AttackState extends AbstractState{

    public AttackState(Player player) {
        super(player);
    }

    @Override
    public void noHealth() {
        System.out.println("No Health");
        player.setCurrentState(new DeceasedState(player));
        System.out.println("Deceased State");
    }

    @Override
    public void fullHealth() {

    }

    @Override
    public void lowHealth() {
        System.out.println("Low Helath");
        player.setCurrentState(new TakeCoverState(player));
        System.out.println("Take cover State");
    }

    @Override
    public void lowAmmo() {
        System.out.println("Low Ammo");
        player.setCurrentState(new ReloadState(player));
        System.out.println("Reload State..");
        player.setCurrentState(new  AttackState(player));
        System.out.println("Attack State");
    }

    @Override
    public void playerApproaches() {

    }

    @Override
    public void playerRuns() {
        System.out.println("Player Runs");
        player.setCurrentState(new PatrolState(player));
        System.out.println("Patrol State");
    }

    @Override
    public void fullAmmo() {

    }
}
