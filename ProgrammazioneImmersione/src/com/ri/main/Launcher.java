package com.ri.main;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import com.ri.support.Support;
import java.awt.Font;

public class Launcher {

	private JFrame frame;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JLabel lblNewLabel_5;
	private JLabel lblTempi;
	private JLabel lblCons;
	
	public static JTextField inputFondoRealeProf;
	public static JTextField inputFondoRealeTempo;
	public static JTextField inputFondoRealeConsumo;
	
	public static JTextField inputSostaProfondaTempo;
	public static JTextField inputSostaProfondaProf;
	public static JTextField inputSostaProfondaConsumo;
	

	public static JTextField inputRisalitaProf;
	public static JTextField inputRisalitaTempo;
	public static JTextField inputRisalitaConsumo;
	
	public static JTextField inputSostaSicEmersioneProf;
	public static JTextField inputSostaSicEmersioneTempo;
	public static JTextField inputSostaSicEmersioneConsumo;
	public static JTextField inputConsumoTotale;
	private JLabel lblNewLabel_4;
	public static JTextField inputConsumoLitriMedi;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Launcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		NumberFormat doubleFormat = NumberFormat.getInstance(Locale.ENGLISH);
		doubleFormat.setGroupingUsed(false);
		doubleFormat.setGroupingUsed(true);// or add the group chars to the filter
		doubleFormat.setMaximumIntegerDigits(10);
		doubleFormat.setMaximumFractionDigits(2);
		doubleFormat.setMinimumFractionDigits(2);
		doubleFormat.setRoundingMode(RoundingMode.HALF_UP);

		NumberFormatter numberFormatter = new NumberFormatter(doubleFormat);
		numberFormatter.setValueClass(Double.class); //optional, ensures you will always get a long value
		numberFormatter.setAllowsInvalid(false); //this 	is the key!!
//		numberFormatter.setMinimum(0D); //Optional
		
		frame = new JFrame();
		frame.setBounds(100, 100, 731, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fondo reale");
		lblNewLabel.setBounds(10, 114, 97, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Deep Stop");
		lblNewLabel_1.setBounds(10, 168, 97, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Risalita");
		lblNewLabel_2.setBounds(10, 222, 97, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Sosta sic. + emers.");
		lblNewLabel_3.setBounds(10, 280, 121, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		btnNewButton = new JButton("Calcola consumi");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Support.calcConsumi();
			}
		});
		btnNewButton.setBounds(130, 359, 182, 20);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_5 = new JLabel("Profondit\u00E0");
		lblNewLabel_5.setBounds(165, 82, 86, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblTempi = new JLabel("Tempi");
		lblTempi.setBounds(278, 82, 86, 20);
		frame.getContentPane().add(lblTempi);
		
		lblCons = new JLabel("Consumi");
		lblCons.setBounds(399, 82, 86, 20);
		frame.getContentPane().add(lblCons);
		
		inputFondoRealeProf = new JFormattedTextField(numberFormatter);
		inputFondoRealeProf.setBounds(165, 122, 86, 20);
		frame.getContentPane().add(inputFondoRealeProf);
		inputFondoRealeProf.setColumns(10);
		inputFondoRealeProf.setText("0");
		
		inputFondoRealeTempo = new JFormattedTextField(numberFormatter);
		inputFondoRealeTempo.setBounds(278, 122, 86, 20);
		frame.getContentPane().add(inputFondoRealeTempo);
		inputFondoRealeTempo.setColumns(10);
		inputFondoRealeTempo.setText("0");
		
		inputFondoRealeConsumo = new JFormattedTextField(numberFormatter);
		inputFondoRealeConsumo.setEditable(false);
		inputFondoRealeConsumo.setBounds(399, 122, 86, 20);
		frame.getContentPane().add(inputFondoRealeConsumo);
		inputFondoRealeConsumo.setColumns(10);
		inputFondoRealeConsumo.setText("0");
		
		inputSostaProfondaProf = new JFormattedTextField(numberFormatter);
		inputSostaProfondaProf.setBounds(165, 176, 86, 20);
		frame.getContentPane().add(inputSostaProfondaProf);
		inputSostaProfondaProf.setColumns(10);
		inputSostaProfondaProf.setText("0");
		
		inputSostaProfondaTempo = new JFormattedTextField(numberFormatter);
		inputSostaProfondaTempo.setBounds(278, 176, 86, 20);
		frame.getContentPane().add(inputSostaProfondaTempo);
		inputSostaProfondaTempo.setColumns(10);
		inputSostaProfondaTempo.setText("0");
		
		inputSostaProfondaConsumo = new JFormattedTextField(numberFormatter);
		inputSostaProfondaConsumo.setEditable(false);
		inputSostaProfondaConsumo.setBounds(399, 176, 86, 20);
		frame.getContentPane().add(inputSostaProfondaConsumo);
		inputSostaProfondaConsumo.setColumns(10);
		inputSostaProfondaConsumo.setText("0");
		
		inputRisalitaProf = new JFormattedTextField(numberFormatter);
		inputRisalitaProf.setBounds(165, 230, 86, 20);
		frame.getContentPane().add(inputRisalitaProf);
		inputRisalitaProf.setColumns(10);
		inputRisalitaProf.setText("0");
		
		inputRisalitaTempo = new JFormattedTextField(numberFormatter);
		inputRisalitaTempo.setBounds(278, 230, 86, 20);
		frame.getContentPane().add(inputRisalitaTempo);
		inputRisalitaTempo.setColumns(10);
		inputRisalitaTempo.setText("0");
		
		inputRisalitaConsumo = new JFormattedTextField(numberFormatter);
		inputRisalitaConsumo.setEditable(false);
		inputRisalitaConsumo.setBounds(399, 230, 86, 20);
		frame.getContentPane().add(inputRisalitaConsumo);
		inputRisalitaConsumo.setColumns(10);
		inputRisalitaConsumo.setText("0");
		
		inputSostaSicEmersioneProf = new JFormattedTextField(numberFormatter);
		inputSostaSicEmersioneProf.setBounds(165, 285, 86, 20);
		frame.getContentPane().add(inputSostaSicEmersioneProf);
		inputSostaSicEmersioneProf.setColumns(10);
		inputSostaSicEmersioneProf.setText("6");
		
		inputSostaSicEmersioneTempo = new JFormattedTextField(numberFormatter);
		inputSostaSicEmersioneTempo.setBounds(278, 285, 86, 20);
		frame.getContentPane().add(inputSostaSicEmersioneTempo);
		inputSostaSicEmersioneTempo.setColumns(10);
		inputSostaSicEmersioneTempo.setText("5");
		
		inputSostaSicEmersioneConsumo = new JFormattedTextField(numberFormatter);
		inputSostaSicEmersioneConsumo.setEditable(false);
		inputSostaSicEmersioneConsumo.setBounds(399, 285, 86, 20);
		frame.getContentPane().add(inputSostaSicEmersioneConsumo);
		inputSostaSicEmersioneConsumo.setColumns(10);
		inputSostaSicEmersioneConsumo.setText("160");
		
		inputConsumoTotale = new JFormattedTextField(numberFormatter);
		inputConsumoTotale.setEditable(false);
		inputConsumoTotale.setBounds(399, 329, 86, 20);
		frame.getContentPane().add(inputConsumoTotale);
		inputConsumoTotale.setColumns(10);
		inputConsumoTotale.setText("160");
		
		lblNewLabel_4 = new JLabel("Consumo medio al minuto");
		lblNewLabel_4.setBounds(538, 82, 174, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		inputConsumoLitriMedi = new JFormattedTextField(numberFormatter);
		inputConsumoLitriMedi.setBounds(533, 122, 86, 20);
		frame.getContentPane().add(inputConsumoLitriMedi);
		inputConsumoLitriMedi.setColumns(10);
		inputConsumoLitriMedi.setText("20");
		
		btnNewButton_1 = new JButton("Calcola Risalita");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Support.calcRisalita();
			}
		});
		btnNewButton_1.setBounds(10, 247, 145, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_6 = new JLabel("Programmazione Immersione Quadra");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(186, 11, 333, 50);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Velocita Discesa 23m/min");
		lblNewLabel_7.setBounds(10, 392, 182, 31);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Velocita Risalita 9m/min");
		lblNewLabel_8.setBounds(262, 392, 154, 31);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Sosta Sicureza 6m");
		lblNewLabel_9.setBounds(426, 389, 131, 37);
		frame.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Emersione 3m/min");
		lblNewLabel_10.setBounds(567, 389, 121, 37);
		frame.getContentPane().add(lblNewLabel_10);
		
		JButton btnNewButton_2 = new JButton("Calcola deep stop");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Support.calcDeepStop();
			}
		});
		btnNewButton_2.setBounds(10, 202, 145, 23);
		frame.getContentPane().add(btnNewButton_2);

	}
}
