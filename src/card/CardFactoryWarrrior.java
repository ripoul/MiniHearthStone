package card;

import card.minion.AvocatCommisDOffice;
import card.minion.decorator.MinionTauntDecorator;
import card.spell.MaitriseDeBlocage;
import card.spell.Tourbillon;

public class CardFactoryWarrrior implements CardFactory{
    @Override
    public Card getCard(String name) {
        switch (name){
            case "Tourbillon":
                return new Tourbillon();
            case "AvocatCommisDOffice":
                return new MinionTauntDecorator(new AvocatCommisDOffice());
            case "MaitriseDeBlocage":
                return new MaitriseDeBlocage();
            default:
                return new CardFactoryCommon().getCard(name);
        }
    }
}