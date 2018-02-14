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
import card.spell.BenedictionDePuissance;
import card.spell.Consecration;
import card.spell.ExplosionDesArcanes;
import card.spell.ImageMiroir;
import card.spell.MaitriseDeBlocage;
import card.spell.Metamorphose;
import card.spell.Tourbillon;

public class CardFactory {

	private static final Map<String, Card> available_card_map = new HashMap<String, Card>();
	
	static {
		available_card_map.put("SanglierBrocheroc", SanglierBrocheroc.createSanglierBrocheroc());
		available_card_map.put("ChevaucheurDeLoup", ChevaucheurDeLoup.createChevaucheurDeLoup());
		available_card_map.put("SoldatDuComteDeLOr", SoldatDuComteDeLOr.createSoldatDuComteDeLOr());
		available_card_map.put("ChefDeRaid", ChefDeRaid.createChefDeRaid());
		available_card_map.put("YetiNoroit", YetiNoroit.createYetiNoroit());
		available_card_map.put("AvocatCommisDOffice", AvocatCommisDOffice.createAvocatCommisDOffice());
		available_card_map.put("ChampionFrisselame", ChampionFrisselame.createChampionFrisselame());
		
		available_card_map.put("BenedictionDePuissance", BenedictionDePuissance.createBenedictionDePuissance());
		available_card_map.put("Consecration", Consecration.createConsecration());
		available_card_map.put("ExplosionDesArcanes", ExplosionDesArcanes.createExplosionDesArcanes());
		available_card_map.put("ImageMiroir", ImageMiroir.createImageMiroir());
		available_card_map.put("MaitriseDeBlocage", MaitriseDeBlocage.createMaitriseDeBlocage());
		available_card_map.put("Metamorphose", Metamorphose.createMetamorphose());
		available_card_map.put("Tourbillon", Tourbillon.createTourbillon());
	}
	
	
	public static Card getCard(String name){
		return available_card_map.get(name);
	}
}
