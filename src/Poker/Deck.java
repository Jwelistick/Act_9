package Poker;

import javafx.scene.image.Image;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private ArrayList<Card> deck;
    private Image backofCard;


    //donde se va a crear la baraja
    public Deck(ArrayList<Card> deck) {

        this.deck = deck;
        backofCard = new Image("./cartas/red_back.png");
    }

    public Deck(){
        List<String> palos = Card.getvalidpalos(); //para llamar el static de los  palos

        List<String> Valores = Card.getvalidValor(); //para llamar al static de los valores

        deck = new ArrayList<>();

        for (String palo:palos){
            for (String Valor:Valores){
                    deck.add(new Card(Valor, palo));
            }
            backofCard = new Image("./cartas/red_back.png");
        }

    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Image getBackofCard() {
        return backofCard;
    }

    public void setBackofCard(Image backofCard) {
        this.backofCard = backofCard;
    }

    //llamé al método SacarCarta pero en la tarea pide que sea HEAD, preferí dejarlo así para no hacer problemas
    public Card SacarCarta() {
        if (deck.size() > 0)
            return deck.remove(0);
        else
            return null;
    }

    //Este método barajea toda la baraja y saca la primer carta barajeada
    public void Shuffle(){
        Collections.shuffle(deck);
    }

}
