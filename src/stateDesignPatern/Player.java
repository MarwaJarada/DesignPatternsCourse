package stateDesignPatern;

import stateDesignPatern.states.IState;
import stateDesignPatern.states.PatrolState;

public class Player implements IPlayer {
    public IState state;

    public void setCurrentState(IState state){
        this.state=state;
    }

    public Player(){
        System.out.println("Player Created");
        this.setCurrentState(new PatrolState(this));
    }

    public void startPlayer(){
        System.out.println("Player Created");
        this.setCurrentState(new PatrolState(this));
    }

    public IState getCurrentState(){
        return state;
    }

    @Override
    public void noHealth() {
        this.state.noHealth();


    }

    @Override
    public void lowHealth() {
        this.state.lowHealth();

    }

    @Override
    public void highHEalth() {
        this.state.fullHealth();
    }

    @Override
    public void playerRuns() {
        this.state.playerRuns();
    }

    @Override
    public void playerApproaches() {
        this.state.playerApproaches();
    }

    @Override
    public void fullAmmo() {
        this.state.fullAmmo();
    }

    @Override
    public void lowAmmo() {
        this.state.lowAmmo();

    }
}
