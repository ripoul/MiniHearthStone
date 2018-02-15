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

public interface CardFactory {
	public Card getCard(String name);
}
