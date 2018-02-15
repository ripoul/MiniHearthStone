package card;

import card.spell.ExplosionDesArcanes;
import card.spell.ImageMiroir;
import card.spell.Metamorphose;

public class CardFactoryMage implements CardFactory {
    @Override
    public Card getCard(String name) {
        switch (name){
            case "ImageMiroir":
                return new ImageMiroir();
            case "ExplosionDesArcanes":
                return new ExplosionDesArcanes();
            case "Metamorphose":
                return new Metamorphose();
            default:
                return new CardFactoryCommon().getCard(name);
        }
    }
}