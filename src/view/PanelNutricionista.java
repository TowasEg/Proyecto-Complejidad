package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * The type Panel nutricionista.
 */
public class PanelNutricionista extends JPanel {

    private JFrame f;
    private JLabel lblTitulo;
    private JLabel lblCalorias;
    private JButton btnInfo;
    private JButton boton;
    private JButton btnCalorias;
    private JButton btnVolver;
    private JTextArea txtPlatos;
    private JComboBox comboBox;
    private JPanel panelCampos;
    private JTextField texto;
    private JTextField texto2;
    private JButton btnGenerarTxt;
    private View view = new View();

    /**
     * Instantiates a new Panel nutricionista.
     */
    public PanelNutricionista() {
        setLayout(null);
        setVisible(false);
        iniciarComponentes();

    }

    /**
     * Iniciar componentes.
     */
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


        btnGenerarTxt = new JButton("Nutricionista personal");
        btnGenerarTxt.setBounds(70, 200, 500, 50);
        btnGenerarTxt.setActionCommand("NUTRICIONISTA");
        add(btnGenerarTxt);


    }


    /**
     * Gets f.
     *
     * @return the f
     */
    public JFrame getF() {
        return f;
    }

    /**
     * Sets f.
     *
     * @param f the f
     */
    public void setF(JFrame f) {
        this.f = f;
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
     * Gets lbl calorias.
     *
     * @return the lbl calorias
     */
    public JLabel getLblCalorias() {
        return lblCalorias;
    }

    /**
     * Sets lbl calorias.
     *
     * @param lblCalorias the lbl calorias
     */
    public void setLblCalorias(JLabel lblCalorias) {
        this.lblCalorias = lblCalorias;
    }

    /**
     * Gets btn info.
     *
     * @return the btn info
     */
    public JButton getBtnInfo() {
        return btnInfo;
    }

    /**
     * Sets btn info.
     *
     * @param btnInfo the btn info
     */
    public void setBtnInfo(JButton btnInfo) {
        this.btnInfo = btnInfo;
    }

    /**
     * Gets boton.
     *
     * @return the boton
     */
    public JButton getBoton() {
        return boton;
    }

    /**
     * Sets boton.
     *
     * @param boton the boton
     */
    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    /**
     * Gets btn calorias.
     *
     * @return the btn calorias
     */
    public JButton getBtnCalorias() {
        return btnCalorias;
    }

    /**
     * Sets btn calorias.
     *
     * @param btnCalorias the btn calorias
     */
    public void setBtnCalorias(JButton btnCalorias) {
        this.btnCalorias = btnCalorias;
    }

    /**
     * Gets btn volver.
     *
     * @return the btn volver
     */
    public JButton getBtnVolver() {
        return btnVolver;
    }

    /**
     * Sets btn volver.
     *
     * @param btnVolver the btn volver
     */
    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    /**
     * Gets txt platos.
     *
     * @return the txt platos
     */
    public JTextArea getTxtPlatos() {
        return txtPlatos;
    }

    /**
     * Sets txt platos.
     *
     * @param txtPlatos the txt platos
     */
    public void setTxtPlatos(JTextArea txtPlatos) {
        this.txtPlatos = txtPlatos;
    }

    /**
     * Gets combo box.
     *
     * @return the combo box
     */
    public JComboBox getComboBox() {
        return comboBox;
    }

    /**
     * Sets combo box.
     *
     * @param comboBox the combo box
     */
    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    /**
     * Gets panel campos.
     *
     * @return the panel campos
     */
    public JPanel getPanelCampos() {
        return panelCampos;
    }

    /**
     * Sets panel campos.
     *
     * @param panelCampos the panel campos
     */
    public void setPanelCampos(JPanel panelCampos) {
        this.panelCampos = panelCampos;
    }

    /**
     * Gets texto.
     *
     * @return the texto
     */
    public JTextField getTexto() {
        return texto;
    }

    /**
     * Sets texto.
     *
     * @param texto the texto
     */
    public void setTexto(JTextField texto) {
        this.texto = texto;
    }

    /**
     * Gets texto 2.
     *
     * @return the texto 2
     */
    public JTextField getTexto2() {
        return texto2;
    }

    /**
     * Sets texto 2.
     *
     * @param texto2 the texto 2
     */
    public void setTexto2(JTextField texto2) {
        this.texto2 = texto2;
    }

    /**
     * Gets btn generar txt.
     *
     * @return the btn generar txt
     */
    public JButton getBtnGenerarTxt() {
        return btnGenerarTxt;
    }

    /**
     * Sets btn generar txt.
     *
     * @param btnGenerarTxt the btn generar txt
     */
    public void setBtnGenerarTxt(JButton btnGenerarTxt) {
        this.btnGenerarTxt = btnGenerarTxt;
    }
}
