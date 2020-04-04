package stateDesignPatern.states;

import stateDesignPatern.Player;

public class TakeCoverState extends AbstractState {
    public TakeCoverState(Player player) {
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
        System.out.println("Full health");
        player.setCurrentState(new AttackState(player));
        System.out.println("Attack State");
    }

    @Override
    public void lowHealth() {

    }

    @Override
    public void lowAmmo() {
        System.out.println("Low Ammo");
        player.setCurrentState(new ReloadState(player));
        System.out.println("Reload State..");
        player.setCurrentState(new TakeCoverState(player));
        System.out.println("Take cover State");

    }

    @Override
    public void playerApproaches() {

    }

    @Override
    public void playerRuns() {

    }

    @Override
    public void fullAmmo() {

    }
}
