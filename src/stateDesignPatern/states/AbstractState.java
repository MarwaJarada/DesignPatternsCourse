package stateDesignPatern.states;

import stateDesignPatern.Player;

public abstract class AbstractState implements IState {
    public Player player;
    public AbstractState(Player player){
        this.player=player;

    }
}
