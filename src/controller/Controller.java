package controller;

import model.Movimiento;
import model.Nutricionista;
import view.PanelNutricionista;
import view.VentanaPrincipal;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * The type Controller.
 */
public class Controller implements ActionListener {

    private VentanaPrincipal ventana;
    private Nutricionista nutricionista;
    private Movimiento movimiento;
    private View view;

    /**
     * Instantiates a new Controller.
     */
    public Controller() {
        ventana = new VentanaPrincipal();
        nutricionista = new Nutricionista();
        movimiento = new Movimiento();
        view = new View();
        ventana.getPanelPrincipal().setVisible(true);
        asignarOyentes();
    }

    /**
     * Asignar oyentes.
     */
    public void asignarOyentes() {
        //panel principal
        ventana.getPanelPrincipal().getBtnNutricion().addActionListener(this);
        ventana.getPanelPrincipal().getBtnRama().addActionListener(this);
        ventana.getPanelPrincipal().getBtnCreditos().addActionListener(this);
        ventana.getPanelPrincipal().getBtnSalir().addActionListener(this);
        //panel nutricionista
        ventana.getPanelNutricionista().getBtnInfo().addActionListener(this);
        ventana.getPanelNutricionista().getBtnVolver().addActionListener(this);
        ventana.getPanelNutricionista().getBtnGenerarTxt().addActionListener(this);
        //panel liebre
        ventana.getPanelLiebre().getBtnVolver().addActionListener(this);
        ventana.getPanelLiebre().getBtnGenerarTxt().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("CREDITOS")) {
            view.creditos();
        }

        if (comando.equals("SALIR")) {
            view.despedida();
            ventana.getPanelPrincipal().setVisible(false);
            ventana.dispose();
        }
        //NUTRICIONISTA

        if (comando.equals("PROBLEMANUTRICIONISTA")) {
            ventana.getPanelPrincipal().setVisible(false);
            ventana.getPanelNutricionista().setVisible(true);
        }
        if (comando.equals("INFONUTRICIONISTA")) {
            view.infoNutricionista();
        }
        if (comando.equals("VOLVERNUTRICIONISTA")) {
            ventana.getPanelNutricionista().setVisible(false);
            ventana.getPanelPrincipal().setVisible(true);
        }
        if (comando.equals("NUTRICIONISTA")){
            nutricionista.Resolver(view.listaCalorias(), view.caloriasConsumir());
        }
        //LIEBRE

        if (comando.equals("PROBLEMARAMA")){
            ventana.getPanelPrincipal().setVisible(false);
            ventana.getPanelLiebre().setVisible(true);

        }
        if (comando.equals("VOLVERLIEBREPIROBA")) {
            ventana.getPanelLiebre().setVisible(false);
            ventana.getPanelPrincipal().setVisible(true);
        }

        if (comando.equals("LIEBREPIROBA")){
            int tamMatrizX = view.pedirDato("**VAMOS A CREAR LA MATRIZ**"+
                    "\n"+"DIGITA EL TAMAÑO DE LA MATRIZ EN EL EJE X: ");

            int tamMatrizY = view.pedirDato("**VAMOS A CREAR LA MATRIZ**"+
                    "\n"+"DIGITA EL TAMAÑO DE LA MATRIZ EN EL EJE Y: ");

            int posX = view.pedirDato("**INGRESA LA POSICIÓN INICIAL EN X**");
            int posY = view.pedirDato("**INGRESA LA POSICIÓN INICIAL EN Y**");

            int posXfin= view.pedirDato("**INGRESA LA POSICIÓN FINAL EN X**");
            int posYfin= view.pedirDato("**INGRESA LA POSICIÓN FINAL EN Y**");

            int camino1 = view.pedirDato("**MOVIMIENTOS HORIZONTALES (P)**");
            int camino2 = view.pedirDato("**MOVIMIENTOS VERTICALES (Q)**");

            ArrayList<String[][]> siguienteMovimiento = movimiento.caminoFull(tamMatrizX, tamMatrizY, posX, posY, posXfin, posYfin, camino1, camino2);
            if (!siguienteMovimiento.isEmpty()){
                JOptionPane.showMessageDialog(null, "LOS CAMINOS MÁS CORTOS ENCONTRADOS: " +(siguienteMovimiento.size()-1));
                for (int i = 0; i < siguienteMovimiento.size() ; i++) {
                        movimiento.matrizLiebre(siguienteMovimiento.get(i));
                }
            }else{
                JOptionPane.showMessageDialog(null, "**EL CAMINO ESTÁ JODIDO**");
            }


        }
    }


}
