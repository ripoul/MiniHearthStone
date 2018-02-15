package card;

import card.minion.ChampionFrisselame;
import card.minion.decorator.MinionChargeDecorator;
import card.minion.decorator.MinionLifeLeechDecorator;
import card.spell.BenedictionDePuissance;
import card.spell.Consecration;

public class CardFactoryPaladin implements  CardFactory {
    @Override
    public Card getCard(String name) {
        switch (name){
            case "ChampionFrisselame":
                return new MinionLifeLeechDecorator(new MinionChargeDecorator(new ChampionFrisselame()));
            case "BenedictionDePuissance":
                return new BenedictionDePuissance();
            case "Consecration":
                return new Consecration();
            default:
                return new CardFactoryCommon().getCard(name);
        }
    }
}