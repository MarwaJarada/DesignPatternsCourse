package stateDesignPatern.states;

import stateDesignPatern.Player;

public class ReloadState extends AbstractState {
    public ReloadState(Player player) {
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

    }

    @Override
    public void lowAmmo() {

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
