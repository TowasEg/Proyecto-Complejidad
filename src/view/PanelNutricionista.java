package view;

import javax.swing.*;
import java.awt.*;

public class PanelNutricionista extends JPanel {

    private JLabel lblTitulo;
    private JLabel lblCalorias;
    private JButton btnInfo;
    private JButton btnCalorias;
    private JButton btnVolver;
    private JTextArea txtPlatos;

    public PanelNutricionista() {
        setLayout(null);
        setVisible(false);
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        setBackground(new Color(46, 211, 179));
        Font font = new Font("Century Gothic", Font.BOLD, 15);

        lblTitulo = new JLabel("Problema Nutricionista");
        lblTitulo.setFont(new Font("Century Gothic", Font.BOLD, 18));
        lblTitulo.setBounds(210, 30, 300, 30);
        add(lblTitulo);

        btnInfo = new JButton("");
        ImageIcon icon = new ImageIcon("src/imagenes/info_icon.png");
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        btnInfo.setIcon(new ImageIcon(icono.getImage()));
        btnInfo.setBounds(450, 35, 25, 25);
        btnInfo.setBackground(null);
        btnInfo.setBorder(null);
        add(btnInfo);
        btnInfo.setActionCommand("INFONUTRICIONISTA");

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(290, 410, 80, 20);
        btnVolver.setActionCommand("VOLVERNUTRICIONISTA");
        add(btnVolver);
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JButton getBtnCalorias() {
        return btnCalorias;
    }

    public void setBtnCalorias(JButton btnCalorias) {
        this.btnCalorias = btnCalorias;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JTextArea getTxtPlatos() {
        return txtPlatos;
    }

    public void setTxtPlatos(JTextArea txtPlatos) {
        this.txtPlatos = txtPlatos;
    }

    public JLabel getLblCalorias() {
        return lblCalorias;
    }

    public void setLblCalorias(JLabel lblCalorias) {
        this.lblCalorias = lblCalorias;
    }

    public JButton getBtnInfo() {
        return btnInfo;
    }

    public void setBtnInfo(JButton btnInfo) {
        this.btnInfo = btnInfo;
    }
}
