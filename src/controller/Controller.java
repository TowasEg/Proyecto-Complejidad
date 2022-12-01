package controller;

import view.VentanaPrincipal;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private VentanaPrincipal ventana;
    private View view;

    public Controller() {
        ventana = new VentanaPrincipal();
        view = new View();
        ventana.getPanelPrincipal().setVisible(true);
        asignarOyentes();
    }

    public void asignarOyentes() {
        ventana.getPanelPrincipal().getBtnNutricion().addActionListener(this);
        ventana.getPanelPrincipal().getBtnCreditos().addActionListener(this);
        ventana.getPanelPrincipal().getBtnSalir().addActionListener(this);

        ventana.getPanelNutricionista().getBtnInfo().addActionListener(this);
        ventana.getPanelNutricionista().getBtnVolver().addActionListener(this);
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
    }

    public void prueba() {
        //a ver si sirve
    }

}
