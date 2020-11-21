package Poker;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String Valor, palo;
    private Image imagen;

    public Card(String Valor, String palo){
        setValor(Valor);
        setPalo(palo);
        String NombreArchivo = Valor + palo.toUpperCase().charAt(0) + ".png"; //este código está así porque el nombre
        imagen = new Image("./cartas/"+NombreArchivo);                     //que le puse a los palos está medio raro
    }

    public String getValor() {
        return Valor;
    }

    public static List<String> getvalidValor(){
        return Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K");
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image image) {
        this.imagen = image;
    }

    /**...
     * Opciones válidas de la cara serán
     * @param valor a,2,3,4,5,6,7,8,9,10,j,q,k
     *             Cualquier otra opción  puesta va a dar error
     */

    public void setValor(String valor) {
        List<String> validValor = getvalidValor();
        valor = valor.toUpperCase(); //pa' evitarnos problemas

        if (validValor.contains(valor))
            this.Valor = valor;
        else
            throw new IllegalArgumentException("Carta inválida, las válidas son: " +
                    "A,2,3,4,5,6,7,8,9,10,J,Q,K");
    }

    public String getPalo() {
        return palo;
    }

    public static List<String> getvalidpalos(){
        return Arrays.asList("hcorazones rojos", "diamantes rojos", "spadas negras", "ctréboles negros"); //a esto me >
                                                                                // > refiero con el penúltimo comentario
    }

    public void setPalo(String palo) {
        List<String> validpalo = getvalidpalos();
        palo = palo.toLowerCase(); //pa' evitarnos problemas

        if (validpalo.contains(palo))
            this.palo = palo;
        else
            throw new IllegalArgumentException("los palos válidos son: " +
                "corazones diamantes espadas y tréboles");
    }

    public String toString(){
        return String.format("%s de %s", Valor, palo);
    }


}
