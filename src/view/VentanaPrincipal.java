package view;

import javax.swing.*;
import java.awt.*;

/**
 * The type Ventana principal.
 */
public class VentanaPrincipal extends JFrame {

    private PanelPrincipal panelPrincipal;
    private PanelNutricionista panelNutricionista;

    /**
     * Instantiates a new Ventana principal.
     */
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

    /**
     * Iniciar componentes.
     */
    public void iniciarComponentes() {
        panelPrincipal = new PanelPrincipal();
        panelPrincipal.setBounds(25, 25, 635, 510);
        getContentPane().add(panelPrincipal);

        panelNutricionista = new PanelNutricionista();
        panelNutricionista.setBounds(25, 25, 635, 510);
        getContentPane().add(panelNutricionista);
    }

    /**
     * Gets panel principal.
     *
     * @return the panel principal
     */
    public PanelPrincipal getPanelPrincipal() {
        return panelPrincipal;
    }

    /**
     * Sets panel principal.
     *
     * @param panelPrincipal the panel principal
     */
    public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    /**
     * Gets panel nutricionista.
     *
     * @return the panel nutricionista
     */
    public PanelNutricionista getPanelNutricionista() {
        return panelNutricionista;
    }

    /**
     * Sets panel nutricionista.
     *
     * @param panelNutricionista the panel nutricionista
     */
    public void setPanelNutricionista(PanelNutricionista panelNutricionista) {
        this.panelNutricionista = panelNutricionista;
    }
}
