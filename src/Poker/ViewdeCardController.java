package Poker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewdeCardController implements Initializable {

    @FXML private ImageView ViewDeck;
    @FXML private ImageView ViewCartaActual;
    private Deck deck;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        deck = new Deck();

        ViewDeck.setImage(deck.getBackofCard());
    }

    @FXML public void SiguientebtnPushed(){
        ViewCartaActual.setImage(deck.SacarCarta().getImagen());
    }

    @FXML public void shoffol(){
        deck.Shuffle();//Este código hará que se barajée el programa antes de correrlo, quitar esta línea hace que el
                        //programa saque las cartas en orden
    }
}
