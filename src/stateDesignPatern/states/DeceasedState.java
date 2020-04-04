package stateDesignPatern.states;

import stateDesignPatern.Player;

public class DeceasedState extends AbstractState {
    public DeceasedState(Player player) {
        super(player);
    }

    @Override
    public void noHealth() {

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
