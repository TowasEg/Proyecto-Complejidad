package view;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private JLabel lblTitulo;
    private JButton btnNutricion;
    private JButton btnBacktracking;
    private JButton btnRama;
    private JButton btnCreditos;
    private JButton btnSalir;

    public PanelPrincipal() {
        setLayout(null);
        setVisible(true);
        iniciarComponentes();
    }

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

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JButton getBtnNutricion() {
        return btnNutricion;
    }

    public void setBtnNutricion(JButton btnNutricion) {
        this.btnNutricion = btnNutricion;
    }

    public JButton getBtnBacktracking() {
        return btnBacktracking;
    }

    public void setBtnBacktracking(JButton btnBacktracking) {
        this.btnBacktracking = btnBacktracking;
    }

    public JButton getBtnRama() {
        return btnRama;
    }

    public void setBtnRama(JButton btnRama) {
        this.btnRama = btnRama;
    }

    public JButton getBtnCreditos() {
        return btnCreditos;
    }

    public void setBtnCreditos(JButton btnCreditos) {
        this.btnCreditos = btnCreditos;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }
}
