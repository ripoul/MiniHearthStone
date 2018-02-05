package card;

import java.util.HashMap;
import java.util.Map;

import card.minion.AvocatCommisDOffice;
import card.minion.ChampionFrisselame;
import card.minion.ChefDeRaid;
import card.minion.ChevaucheurDeLoup;
import card.minion.SanglierBrocheroc;
import card.minion.SoldatDuComteDeLOr;
import card.minion.YetiNoroit;

public class CardFactory {

	private static final Map<String, Card> available_card_map = new HashMap<String, Card>();
	
	static {
		available_card_map.put("SanglierBrocheroc", SanglierBrocheroc.createSanglierBrocheroc());
		available_card_map.put("ChevaucheurDeLoup", ChevaucheurDeLoup.createChevaucheurDeLoup());
		available_card_map.put("SoldatDuCompteDeLOr", SoldatDuComteDeLOr.createSoldatDuComteDeLOr());
		available_card_map.put("ChefDeRaid", ChefDeRaid.createChefDeRaid());
		available_card_map.put("YetiNoroit", YetiNoroit.createYetiNoroit());
		available_card_map.put("AvocatCommisDOffice", AvocatCommisDOffice.createAvocatCommisDOffice());
		available_card_map.put("ChampionFrisselame", ChampionFrisselame.createChampionFrisselame());
		
	}
	
	
	public static Card getCard(String name){
		return available_card_map.get(name);
	}
}
