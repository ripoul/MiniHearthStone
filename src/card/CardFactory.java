package card;

/**
 *
 * @author gguillet lbrisjules
 *
 * A factory to create new card
 *
 */
public interface CardFactory {
    /**
    * @param s the string to the card we are looking for
    *
    */
    public Card getCard(String s);
}
