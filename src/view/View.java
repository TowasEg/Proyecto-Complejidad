package view;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * The type View.
 */
public class View extends Component {

    private Scanner leer = new Scanner(System.in);


    /**
     * Instantiates a new View.
     */
    public View() {
    }

    /**
     * Lista calorias int [ ].
     *
     * @return the int [ ]
     */
    public int[] listaCalorias() {
        int[] platos = new int[0];
        try {
            int numPlatos = Integer.parseInt(JOptionPane.showInputDialog("**INGRESE LA CANTIDAD DE PLATOS DEL MENÚ**"));
            platos = new int[numPlatos];

            for (int i = 0; i < numPlatos; i++) {
                platos[i] = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("INGRESE LAS CALORIAS DEL PLATO #" + (i + 1) + ": ").charAt(0)));
            }

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "**DEBE INGRESAR UN VALOR NÚMERICO.**");
        }
        return platos;
    }

    /**
     * Calorias consumir int.
     *
     * @return the int
     */
    public int caloriasConsumir() {
        int calorias = 0;
        try {
            calorias = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE CALORÍAS QUE VA A CONSUMIR: "));

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "**DEBE INGRESAR UN VALOR NÚMERICO.**");
        }
        return calorias;
    }

    /**
     * Info nutricionista.
     */
    public void infoNutricionista() {
        JOptionPane.showMessageDialog(this, "Un nutricionista va a un restaurante. En la carta aparecen\n" +
                        "todos los platos disponibles con el número de calorías.\n" +
                        "El nutricionista conoce el número mínimo de calorías que\n" +
                        "su cuerpo necesita en esa comida, sin repetir platos.\n\n" +
                        "El objetivo del programa es encontrar el menú que\n" +
                        "cubra exactamente esa cantidad de calorías o las\n" +
                        "supere de forma mínima.",
                "Información Problema Nutricionista", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Creditos.
     */
    public void creditos() {
        JOptionPane.showMessageDialog(this, "Programa creado por:\n" +
                        "Karen Ximena Rojas Calderon\nJose Miguel Salcedo Mercado\n" +
                        "Tomas Espitia Galindo\nNicolas Stiven Perez Arguello\n\n" +
                        "Complejidad Algorítmica\nIngeniería de Sistemas\nIV Semestre",
                "Créditos", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Despedida.
     */
    public void despedida() {
        JOptionPane.showMessageDialog(this, "Gracias por utilizar el programa\nVuelva pronto :)",
                "Adiós", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Pedir dato int.
     *
     * @param mensaje the mensaje
     * @return the int
     */
    public  int pedirDato(String mensaje) {

        int respuesta = 0;

        try {
            String instruccion=JOptionPane.showInputDialog(mensaje);
            respuesta=Integer.parseInt(instruccion);

        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "**DEBE INGRESAR UN VALOR NÚMERICO.**");
            respuesta = pedirDato(mensaje);

        }
        return respuesta;
    }

}
