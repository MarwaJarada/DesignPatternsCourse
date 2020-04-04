package stateDesignPatern.states;

import stateDesignPatern.Player;

public class PatrolState extends AbstractState {

    public PatrolState(Player player) {
        super(player);
    }

    @Override
    public void noHealth() {
        System.out.println("Player has no health");
        player.setCurrentState(new DeceasedState(player));
        System.out.println("Deceased state");

    }

    @Override
    public void fullHealth() {

    }

    @Override
    public void lowHealth() {

    }

    @Override
    public void lowAmmo() {

    }

    @Override
    public void playerApproaches() {
        System.out.println("Player Approaches ");
        player.setCurrentState(new AttackState(player));
        System.out.println("Attacking state");

    }

    @Override
    public void playerRuns() {

    }

    @Override
    public void fullAmmo() {

    }
}
