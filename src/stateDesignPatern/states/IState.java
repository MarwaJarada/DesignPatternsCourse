package stateDesignPatern.states;

public interface IState {
    public void noHealth();
    public void fullHealth();
    public void lowHealth();
    public void lowAmmo();
    public void playerApproaches();
    public void playerRuns();
    public void fullAmmo();
}
