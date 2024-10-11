package br.edu.fatecpg.gui.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import br.edu.fatecpg.gui.model.Cliente;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JRadioButton;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nm;
	private JTextField txt_idd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton radio_masc = new JRadioButton("Masculino");
		radio_masc.setBounds(65, 104, 109, 23);
		contentPane.add(radio_masc);
		
		JRadioButton radio_fem = new JRadioButton("Feminino");
		radio_fem.setBounds(65, 130, 109, 23);
		contentPane.add(radio_fem);
	
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(radio_masc);
		grupo.add(radio_fem);
		
		JLabel nm_txt = new JLabel("Nome:");
		nm_txt.setHorizontalAlignment(SwingConstants.CENTER);
		nm_txt.setBounds(226, 49, 130, 14);
		contentPane.add(nm_txt);
		
		JLabel idd_txt = new JLabel("Idade:");
		idd_txt.setHorizontalAlignment(SwingConstants.CENTER);
		idd_txt.setBounds(227, 69, 130, 14);
		contentPane.add(idd_txt);
		
		JLabel sex_txt = new JLabel("Sexo:");
		sex_txt.setHorizontalAlignment(SwingConstants.CENTER);
		sex_txt.setBounds(226, 89, 130, 14);
		contentPane.add(sex_txt);
		
		txt_nm = new JTextField();
		txt_nm.setBounds(65, 50, 86, 20);
		contentPane.add(txt_nm);
		txt_nm.setColumns(10);
		
		txt_idd = new JTextField();
		txt_idd.setBounds(65, 77, 86, 20);
		contentPane.add(txt_idd);
		txt_idd.setColumns(10);
		
		JButton btn_confirm = new JButton("Confirmar");
		btn_confirm.setBounds(38, 163, 100, 23);
		contentPane.add(btn_confirm);
		
		JLabel lblNewLabel = new JLabel("Formulário");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(36, 13, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome: ");
		lblNewLabel_1.setBounds(26, 53, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Idade: ");
		lblNewLabel_1_1.setBounds(26, 80, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sexo:");
		lblNewLabel_1_1_1.setBounds(26, 120, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		btn_confirm.addActionListener(new Cliente(txt_nm, nm_txt, txt_idd, idd_txt, radio_masc, radio_fem, sex_txt));
		
		JLabel lblResumo = new JLabel("Resumo");
		lblResumo.setHorizontalAlignment(SwingConstants.CENTER);
		lblResumo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResumo.setBounds(238, 15, 100, 14);
		contentPane.add(lblResumo);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{radio_masc, radio_fem, nm_txt, idd_txt, sex_txt, txt_nm, txt_idd, btn_confirm, lblNewLabel, lblNewLabel_1, lblNewLabel_1_1, lblNewLabel_1_1_1, lblResumo}));
		
	}
}
