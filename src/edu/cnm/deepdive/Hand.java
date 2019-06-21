package edu.cnm.deepdive;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public  abstract class Hand {

  protected List<Card> getCards() {
    return cards;
  }

  protected Hand(){
    cards = new LinkedList<>();
  }

  protected void setCards(List<Card> cards) {
    this.cards = cards;
  }

  private List<Card> cards;

  public List<Card> showCards(){
    return Collections.unmodifiableList(cards);
  }

  public void add(Card card){
    cards.add(card);
  }

public void reset(){
    cards.clear();
}

}
