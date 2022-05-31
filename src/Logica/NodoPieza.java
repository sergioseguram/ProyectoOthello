package Logica;

public class NodoPieza extends javax.swing.JButton {// el objeto ya esxiste en java swing, los botnes tiene metodos de clic, tons al hacer esto
    //me permite usar mis piezas como boton, es un boton modificado.

    /**
     * Método para un color del nodo 
     */
    private String nodoColor;

    /**
     * Punteros para cada nodo
     */
    private NodoPieza norte;
    private NodoPieza sur;
    private NodoPieza este;
    private NodoPieza oeste;
    private NodoPieza noroeste;
    private NodoPieza noreste;
    private NodoPieza sureste;
    private NodoPieza suroeste;

    NodoPieza aux;

    /**
     * método que asigna las direcciones de las piezas del tablero
     */
    public NodoPieza() {
        this.norte = null;
        this.sur = null;
        this.este = null;
        this.oeste = null;
        this.noroeste = null;
        this.noreste = null;
        this.sureste = null;
        this.suroeste = null;
        this.nodoColor="n";
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección norte de la ficha
     */
    public NodoPieza getNorte() {
        return norte;
    }

    /**
     * asigna la dirección de la ficha al norte
     * @param norte la dirección norte
     */
    public void setNorte(NodoPieza norte) {
        this.norte = norte;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección sur de la ficha
     */
    public NodoPieza getSur() {
        return sur;
    }

    /**
     * asigna la dirección de la ficha al sur 
     * @param sur la direción sur
     */
    public void setSur(NodoPieza sur) {
        this.sur = sur;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección este de la ficha
     */
    public NodoPieza getEste() {
        return este;
    }

    /**
     * asigna la dirección de la ficha al este
     * @param este la dirección este
     */
    public void setEste(NodoPieza este) {
        this.este = este;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección oeste de la ficha
     */
    public NodoPieza getOeste() {
        return oeste;
    }

    /**
     * asigna la dirección de la ficha al oste
     * @param oeste la dirección oeste
     */
    public void setOeste(NodoPieza oeste) {
        this.oeste = oeste;
    }

    /**
     * método que obtiene la direción de la ficha
     * @return la dirección noroeste de la ficha
     */
    public NodoPieza getNoroeste() {
        return noroeste;
    }

    /**
     * asigna la dirección de la ficha al noroeste
     * @param noroeste la dirección noroeste
     */
    public void setNoroeste(NodoPieza noroeste) {
        this.noroeste = noroeste;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección noreste de la ficha
     */
    public NodoPieza getNoreste() {
        return noreste;
    }

    /**
     * asigna la dirección de la ficha al noreste
     * @param noreste la dirección noreste
     */
    public void setNoreste(NodoPieza noreste) {
        this.noreste = noreste;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección sureste de la ficha
     */
    public NodoPieza getSureste() {
        return sureste;
    }

    /**
     * asigna la dirección de la ficha al sureste 
     * @param sureste la dirección sureste
     */
    public void setSureste(NodoPieza sureste) {
        this.sureste = sureste;
    }

    /**
     * método que obtiene la dirección de la ficha
     * @return la dirección suroeste de la ficha
     */
    public NodoPieza getSuroeste() {
        return suroeste;
    }

    /**
     * asigna la dirección de la ficha al suroeste
     * @param suroeste la dirección suroeste
     */
    public void setSuroeste(NodoPieza suroeste) {
        this.suroeste = suroeste;
    }

    /**
     * @return el nodoColor Obtiene el color del nodo a ser cambiado
     */
    public String getNodoColor() {
        return nodoColor;
    }

    /**
     * @param nodoColor cambia el color del nodo
     */
    public void setNodoColor(String nodoColor) {
        this.nodoColor = nodoColor;
    }
}
