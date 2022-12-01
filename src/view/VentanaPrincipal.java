package view;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private PanelPrincipal panelPrincipal;
    private PanelNutricionista panelNutricionista;

    public VentanaPrincipal() {
        setTitle("Programación dinámica");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(5, 38, 37));
        getContentPane().setLayout(null);

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        iniciarComponentes();
    }

    public void iniciarComponentes() {
        panelPrincipal = new PanelPrincipal();
        panelPrincipal.setBounds(25, 25, 635, 510);
        getContentPane().add(panelPrincipal);

        panelNutricionista = new PanelNutricionista();
        panelNutricionista.setBounds(25, 25, 635, 510);
        getContentPane().add(panelNutricionista);
    }

    public PanelPrincipal getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public PanelNutricionista getPanelNutricionista() {
        return panelNutricionista;
    }

    public void setPanelNutricionista(PanelNutricionista panelNutricionista) {
        this.panelNutricionista = panelNutricionista;
    }
}
