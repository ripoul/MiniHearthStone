package card;

import card.minion.*;
import card.minion.decorator.MinionChargeDecorator;
import card.minion.decorator.MinionTauntDecorator;

public class CardFactoryCommon implements CardFactory {
    public Card getCard(String name) {
        switch (name) {
            case "SanglierBrocheroc":
                return new SanglierBrocheroc();
            case "SoldatDuComteDeLOr":
                return new MinionTauntDecorator(new SoldatDuComteDeLOr());
            case "ChevaucheurDeLoup":
                return new MinionChargeDecorator(new ChevaucheurDeLoup());
            case "ChefDeRaid":
                return new ChefDeRaid();
            default:
                return new YetiNoroit();
        }
    }
}
