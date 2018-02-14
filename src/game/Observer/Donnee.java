package game.Observer;

import hero.Hero;

import java.util.ArrayList;

public class Donnee implements Sujet {
    private ArrayList<Observer> observers;
    private Hero hero;

    public Donnee(){
        observers = new ArrayList<>();
    }

    @Override
    public void enregistrerObs(Observer o) {
        observers.add(o);
    }

    @Override
    public void supprierObs(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifierObs() {
        for (int i = 0; i<observers.size(); i++){
            observers.get(i).actualiser(hero);
        }
    }

    public void setHero(Hero hero) {
        this.hero = hero;
        notifierObs();
    }
}
