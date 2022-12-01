package view;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class View extends Component {

    private Scanner leer = new Scanner(System.in);

    public View() {
    }

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

    public void creditos() {
        JOptionPane.showMessageDialog(this, "Programa creado por:\n" +
                        "Karen Ximena Rojas Calderon\nJose Miguel Salcedo Mercado\n" +
                        "Tomas Espitia Galindo\nNicolas Stiven Perez Arguello\n\n" +
                        "Complejidad Algorítmica\nIngeniería de Sistemas\nIV Semestre",
                "Créditos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void despedida() {
        JOptionPane.showMessageDialog(this, "Gracias por utilizar el programa\nVuelva pronto :)",
                "Adiós", JOptionPane.INFORMATION_MESSAGE);
    }

}
