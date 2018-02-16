package game.Observer;

public class HeroLifeObserver implements Observer{

    public HeroLifeObserver(Sujet sujet){
        sujet.enregistrerObs(this);
    }

    @Override
    public void actualiser(int vie) {
        if (vie<=0){
            System.out.println("CE HERO EST MORT");
            System.exit(5);
        }
    }
}
