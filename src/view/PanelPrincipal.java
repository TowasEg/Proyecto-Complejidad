package view;

import javax.swing.*;
import java.awt.*;

/**
 * The type Panel principal.
 */
public class PanelPrincipal extends JPanel {

    private JLabel lblTitulo;
    private JButton btnNutricion;
    private JButton btnBacktracking;
    private JButton btnRama;
    private JButton btnCreditos;
    private JButton btnSalir;

    /**
     * Instantiates a new Panel principal.
     */
    public PanelPrincipal() {
        setLayout(null);
        setVisible(true);
        iniciarComponentes();
    }

    /**
     * Iniciar componentes.
     */
    public void iniciarComponentes() {
        setBackground(new Color(46, 211, 179));
        Font font = new Font("Century Gothic", Font.BOLD, 14);

        lblTitulo = new JLabel("Bienvenido al taller final");
        lblTitulo.setFont(new Font("Century Gothic", Font.BOLD, 18));
        lblTitulo.setBounds(225, 30, 350, 30);
        add(lblTitulo);

        btnNutricion = new JButton("Problema nutricionista");
        btnNutricion.setFont(font);
        btnNutricion.setBounds(170, 90, 300, 30);
        add(btnNutricion);
        btnNutricion.setActionCommand("PROBLEMANUTRICIONISTA");

        btnBacktracking = new JButton("Problema backtracking");
        btnBacktracking.setFont(font);
        btnBacktracking.setBounds(170, 150, 300, 30);
        add(btnBacktracking);
        btnBacktracking.setActionCommand("PROBLEMABACKTRACKING");

        btnRama = new JButton("Problema rama y poda");
        btnRama.setFont(font);
        btnRama.setBounds(170, 210, 300, 30);
        add(btnRama);
        btnRama.setActionCommand("PROBLEMARAMA");

        btnCreditos = new JButton("Créditos");
        btnCreditos.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnCreditos.setBounds(170, 400, 100, 25);
        add(btnCreditos);
        btnCreditos.setActionCommand("CREDITOS");

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnSalir.setBounds(370, 400, 100, 25);
        add(btnSalir);
        btnSalir.setActionCommand("SALIR");
    }

    /**
     * Gets lbl titulo.
     *
     * @return the lbl titulo
     */
    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    /**
     * Sets lbl titulo.
     *
     * @param lblTitulo the lbl titulo
     */
    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    /**
     * Gets btn nutricion.
     *
     * @return the btn nutricion
     */
    public JButton getBtnNutricion() {
        return btnNutricion;
    }

    /**
     * Sets btn nutricion.
     *
     * @param btnNutricion the btn nutricion
     */
    public void setBtnNutricion(JButton btnNutricion) {
        this.btnNutricion = btnNutricion;
    }

    /**
     * Gets btn backtracking.
     *
     * @return the btn backtracking
     */
    public JButton getBtnBacktracking() {
        return btnBacktracking;
    }

    /**
     * Sets btn backtracking.
     *
     * @param btnBacktracking the btn backtracking
     */
    public void setBtnBacktracking(JButton btnBacktracking) {
        this.btnBacktracking = btnBacktracking;
    }

    /**
     * Gets btn rama.
     *
     * @return the btn rama
     */
    public JButton getBtnRama() {
        return btnRama;
    }

    /**
     * Sets btn rama.
     *
     * @param btnRama the btn rama
     */
    public void setBtnRama(JButton btnRama) {
        this.btnRama = btnRama;
    }

    /**
     * Gets btn creditos.
     *
     * @return the btn creditos
     */
    public JButton getBtnCreditos() {
        return btnCreditos;
    }

    /**
     * Sets btn creditos.
     *
     * @param btnCreditos the btn creditos
     */
    public void setBtnCreditos(JButton btnCreditos) {
        this.btnCreditos = btnCreditos;
    }

    /**
     * Gets btn salir.
     *
     * @return the btn salir
     */
    public JButton getBtnSalir() {
        return btnSalir;
    }

    /**
     * Sets btn salir.
     *
     * @param btnSalir the btn salir
     */
    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }
}
