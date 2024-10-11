package br.edu.fatecpg.gui.model;
import javax.swing.*;
import java.awt.event.*;

public class Cliente implements ActionListener {
    private JTextField txt_nm;
    private JLabel nm_txt;
    private JTextField txt_idd;
    private JLabel idd_txt;
    private JRadioButton radio_masc;
    private JRadioButton radio_fem;
    private JLabel sex_txt;

    public Cliente(JTextField txt_nm, JLabel nm_txt, JTextField txt_idd, JLabel idd_txt, 
                   JRadioButton radio_masc, JRadioButton radio_fem, JLabel sex_txt) {
        this.txt_nm = txt_nm;
        this.nm_txt = nm_txt;
        this.txt_idd = txt_idd;
        this.idd_txt = idd_txt;
        this.radio_masc = radio_masc;
        this.radio_fem = radio_fem;
        this.sex_txt = sex_txt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (txt_nm.getText().isEmpty() || txt_idd.getText().isEmpty() || (!radio_masc.isSelected() && !radio_fem.isSelected())) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos antes de confirmar", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nm = txt_nm.getText();
        nm_txt.setText("Nome: " + nm);

        int idd = Integer.parseInt(txt_idd.getText());
        idd_txt.setText("Idade: " + idd);

        String texto_sexo = "";
        if (radio_masc.isSelected()) {
            texto_sexo = "Masculino";
        } else if (radio_fem.isSelected()) {
            texto_sexo = "Feminino";
        }
        sex_txt.setText("Sexo: " + texto_sexo);
    }
}


