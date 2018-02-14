package game.Observer;

import hero.Hero;

public class HeroLifeObserver implements Observer{
    private Hero hero;
    private Sujet sujet;

    public HeroLifeObserver(Sujet sujet){
        this.sujet=sujet;
        sujet.enregistrerObs(this);
    }

    @Override
    public void actualiser(Hero hero) {
        this.hero=hero;
        if (this.hero.getCurrentHealth()<=0){
            System.out.println("CE HERO EST MORT");
        }
    }
}
