package game.Observer;

public interface Sujet {
    public void enregistrerObs(Observer o);
    public void supprierObs(Observer o);
    public void notifierObs();
}
