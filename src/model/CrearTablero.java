package model;

import java.util.ArrayList;

/**
 * The type Crear tablero.
 */
public class CrearTablero {

    private Liebre[][] liebre;
    private ArrayList<Liebre> encontrarCamino;

    /**
     * Instantiates a new Crear tablero.
     *
     * @param liebre the liebre
     */
    public CrearTablero (Liebre[][] liebre ){
        this.liebre = liebre;
        encontrarCamino = new ArrayList<>();
    }

    /**
     * Limitartableto boolean.
     *
     * @param x the x
     * @param y the y
     * @return the boolean
     */
    public boolean limitartableto(int x, int y) {
        return (x > 0 && x < (liebre.length - 1)) && (y > 0 && y < (liebre[0].length-1));
    }

    /**
     * Posicion liebre.
     *
     * @param x the x
     * @param y the y
     * @return the liebre
     */
    public Liebre posicion(int x ,int y) {
        if (limitartableto(x,y)) {
            return liebre[x][y];
        }
        return null;
    }

    /**
     * Mejor camino.
     *
     * @param camino1 the camino 1
     */
    public void mejorCamino (ArrayList<Liebre> camino1) {
        if (camino1 != null && !camino1.isEmpty() ) {
            encontrarCamino=camino1;
        }
    }

    /**
     * Mostrar string.
     *
     * @return the string
     */
    public String mostrar() {
        String camino = "";
        camino += "Minimo de saltos: " + (encontrarCamino.size() - 1);
        for (Liebre c : encontrarCamino) {
            camino += "\n" + c;
        }
        return camino;
    }

    /**
     * Get liebre liebre [ ] [ ].
     *
     * @return the liebre [ ] [ ]
     */
    public Liebre[][] getLiebre() {
        return liebre;
    }

    /**
     * Sets liebre.
     *
     * @param liebre the liebre
     */
    public void setLiebre(Liebre[][] liebre) {
        this.liebre = liebre;
    }

    /**
     * Gets encontrar camino.
     *
     * @return the encontrar camino
     */
    public ArrayList<Liebre> getEncontrarCamino() {
        return encontrarCamino;
    }

    /**
     * Sets encontrar camino.
     *
     * @param encontrarCamino the encontrar camino
     */
    public void setEncontrarCamino(ArrayList<Liebre> encontrarCamino) {
        this.encontrarCamino = encontrarCamino;
    }
}
