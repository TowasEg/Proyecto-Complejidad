package view;

import javax.swing.*;
import java.awt.*;

/**
 * The type Ventana principal.
 */
public class VentanaPrincipal extends JFrame {

    private PanelPrincipal panelPrincipal;
    private PanelNutricionista panelNutricionista;
    private PanelLiebre panelLiebre;

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

        panelLiebre = new PanelLiebre();
        panelLiebre.setBounds(25, 25, 635, 510);
        getContentPane().add(panelLiebre);
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

    /**
     * Gets panel liebre.
     *
     * @return the panel liebre
     */
    public PanelLiebre getPanelLiebre() {
        return panelLiebre;
    }

    /**
     * Sets panel liebre.
     *
     * @param panelLiebre the panel liebre
     */
    public void setPanelLiebre(PanelLiebre panelLiebre) {
        this.panelLiebre = panelLiebre;
    }
}
